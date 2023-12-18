import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            int N = S.length();

            int[] M = new int[N + 1];

            for (int i = 0; i < N; i++) {
                M[i] = S.charAt(N - 1 - i) - '0';
            }

            StringBuilder sb = new StringBuilder();

            long ans = 0;
            for (int i = 0; i <= N; i++) {
                if (M[i] == 10) {
                    M[i + 1]++;
                    sb.append(0);
                    continue;
                }

                if (M[i] <= 4) {
                    ans += M[i];
                    sb.append(M[i]);
                } else if (M[i] == 5) {
                    if (M[i + 1] >= 5) {
                        M[i + 1]++;
                    }
                    ans += 5;
                    sb.append(5);
                } else if (M[i] >= 6) {
                    ans += (10 - M[i]);
                    M[i + 1]++;
                    sb.append(10 - M[i]);
                }
            }

            //System.out.println(sb.reverse().toString());

            System.out.println(ans);
        }
    }

}
