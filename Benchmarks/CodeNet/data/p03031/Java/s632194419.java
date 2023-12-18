import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] S = new int[m][n];
        int[] P = new int[m];
        int ans = 0;
        for(int i = 0; i < m; i++) {
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) S[i][j] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) P[i] = sc.nextInt();

        for(int i = 0; i < (1 << n); i++) {
            int c1 = 0;
            for(int j = 0; j < m; j++) {
                int c2 = 0;
                for(int sft : S[j]) {
                    if(sft > 0) {
                         c2 += (i >> (n - sft)) & 1;
                    }
                }
                if(c2 % 2 == P[j]) c1++;
            }
            if(c1 == m) ans++;
        }
        System.out.println(ans);
    }
}
