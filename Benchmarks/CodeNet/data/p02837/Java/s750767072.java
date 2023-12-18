import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] info = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                info[i][j] = -1;
            }
        }

        for (int i = 0; i < N; ++i) {
            int A = sc.nextInt();
            for (int j = 0; j < A; ++j) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                info[i][X - 1] = Y;
            }
        }

        int ans = 0;
        for (int i = 0; i < (1 << N); ++i) {
            boolean ok = true;  
            for (int j = 0; j < N; ++j) {
                if ((i & (1 << j)) == 0) continue;
                for (int k = 0; k < N; ++k) {
                    if (info[j][k] == -1) continue;
                    if (info[j][k] != (((i & (1 << k)) != 0) ? 1 : 0)) {
                        ok = false;
                    }
                }
                if (!ok) break;
            }
            if (ok) {
                int cnt = 0;
                for (int j = 0; j < N; ++j) {
                    if ((i & (1 << j)) > 0) {
                        ++cnt;
                    }
                }
                if (ans < cnt) {
                    ans = cnt;
                }
            }
        }
        
        System.out.println(ans);
    }
}
