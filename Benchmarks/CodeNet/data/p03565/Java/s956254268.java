import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        String T = sc.next();
        int M = T.length();

        String NOT = "UNRESTORABLE";

        if (M > N) {
            System.out.println(NOT);
            return;
        }

        NEXT: for (int i = 0; i <= N - M; i++) {
            int end = N - 1 - i;
            for (int j = 0; j < M; j++) {
                if (S.charAt(end - j) == '?' || S.charAt(end - j) == T.charAt(M - 1 - j)) continue;
                continue NEXT;
            }

            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < N; k++) {
                if (k <= end && k >= end - M + 1) {
                    sb.append(T.charAt(k - (end - M + 1)));
                } else {
                    if (S.charAt(k) == '?') {
                        sb.append('a');
                    } else {
                        sb.append(S.charAt(k));
                    }
                }
            }
            System.out.println(sb.toString());
            return;
        }

        System.out.println(NOT);
    }
}