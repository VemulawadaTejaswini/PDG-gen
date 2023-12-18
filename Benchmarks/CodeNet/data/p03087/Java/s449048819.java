import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int Q = in.nextInt();
            String S = in.next();
            int[] l = new int[Q];
            int[] r = new int[Q];
            for (int i = 0; i < Q; i++) {
                l[i] = in.nextInt() - 1;
                r[i] = in.nextInt() - 1;
            }

            boolean[] isAC = new boolean[N];
            for (int i = 1; i < N; i++) {
                if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') {
                    isAC[i] = true;
                }
            }

            int[] count = new int[N];
            for (int i = 1; i < N; i++) {
                count[i] = (isAC[i] ? 1 : 0) + count[i - 1];
            }

            for (int i = 0; i < Q; i++) {
                System.out.println(count[r[i]] - (l[i] - 1 < 0 ? 0 : count[l[i]]));
            }
        }
    }
}
