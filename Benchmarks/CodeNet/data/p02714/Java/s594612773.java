import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        System.out.println(solve(N, S));
    }

    private static long solve(int N, String S) {
        long count = 0;

        int[][] hit = new int[N+1][3];
        char[] RGB = {'R', 'G', 'B'};
        for (int i=N-1; i>=0; i--) {
            for (int j=0; j<3; j++) {
                hit[i][j] = S.charAt(i) == RGB[j] ? 1 : 0;

                if (i != N-1) {
                    hit[i][j] += hit[i + 1][j];
                }
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    continue;
                }

                int chidx = 0;
                for (int k=0; k<3; k++) {
                    if (S.charAt(i) != RGB[k] && S.charAt(j) != RGB[k]) {
                        chidx = k;
                        break;
                    }
                }

                count += hit[j+1][chidx];
                if (j+j-i < N && S.charAt(j + (j-i)) == RGB[chidx]) {
                    count--;
                }
            }
        }

        return count;
    }
}