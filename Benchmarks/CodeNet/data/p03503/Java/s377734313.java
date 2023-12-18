import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[][][] f=new int[n+1][6][3];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 2; k++) {
                    f[i][j][k]=sc.nextInt();
                }
            }
        }
        int[][] p=new int[n+1][11];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 10; j++) {
                p[i][j]=sc.nextInt();
            }
        }
        int[][][] rev=new int[6][3][2];
        int open=0;
        int[] c=new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 2; k++) {
                    if(f[i][j][k]==1)c[i]++;
                }
            }
        }
        long ans=Integer.MIN_VALUE;
        int[][] d=new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==j)d[i][j]=1;
            }
        }
        for (int k = 1; k <= n; k++) {
            long t=0;
            for (int i = 1; i <= n; i++) {
                long plus = Integer.MIN_VALUE;
                for (int j = d[k][i]; j <= c[i]; j++) {
                    plus = max(plus, p[i][j]);
                }
                t += plus;
            }
            ans=max(ans,t);
        }
        out.println(ans);

    }
}