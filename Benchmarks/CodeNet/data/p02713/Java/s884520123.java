import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int k = sc.nextInt();
        int[][] a = new int[k+1][k+1];
        long ans = 0L;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                int x = a[i][j];
                if(x == 0) {
                    x = gcd(i,j);
                    a[i][j] = x; a[j][i] = x;
                }
                for (int l = 1; l <= k; l++) {
                    int y = a[x][l];
                    if(y == 0){
                        y = gcd(x, l);
                        a[x][l] = y; a[l][x] = y;
                    }
                    ans += y;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

    public static int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
