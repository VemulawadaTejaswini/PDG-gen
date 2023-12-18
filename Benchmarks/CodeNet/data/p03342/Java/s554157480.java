import java.util.ArrayList;
import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Long> mList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            mList.add(scanner.nextLong());
        }

        long[][] sum = new long[N][N];
        long[][] xor = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum[i][j] = 0;
                xor[i][j] = 0;
                if (i == j) {
                    sum[i][j] = mList.get(i);
                    xor[i][j] = mList.get(i);
                }
            }
        }
        int ans = N;

        for (int r = 0; r < N; r++) {
            for (int l = r + 1; l < N; l++) {
                sum[r][l] = sum[r][l - 1] + mList.get(l);
                xor[r][l] = xor[r][l - 1] ^ mList.get(l);
                if (sum[r][l] == xor[r][l]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
