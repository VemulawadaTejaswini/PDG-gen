import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] c = new long[n+1][n+1];
        for(int i = 0; i<n+1; i++) {
            c[i][0] = 1;
        }
        for(int i = 1; i<n+1; i++) {
            for(int j = 1; j<n+1; j++) {
                c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % (1000000007);
            }
        }
        for(int i = 1; i<=k; i++) {
            long ans = (c[n-k+1][i]*c[k-1][i-1])%(1000000007);
            System.out.println(ans);
        }

    }
}