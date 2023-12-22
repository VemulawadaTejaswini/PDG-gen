import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        new Main().main();
    }
    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp1 = new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                dp1[i][j] = dp1[i-1][j] + dp1[i][j-1] - dp1[i-1][j-1] + mat[i][j];
            }
        }
        
        int[][] dp2 = new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int max = dp1[i][j];
                for(int k=1;k<=i;k++) {
                    for(int l=1;l<=j;l++) {
                        max = Math.max(dp1[i][j] - dp1[k-1][j] - dp1[i][l-1] + dp1[k-1][l-1] , max);
                    }
                }
                dp2[i][j] = max;
            }
        }
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=n;j++) {
//                System.out.print(dp2[i][j] + " ");
//            }
//            System.out.println();
//        }
        
        int max = dp2[1][1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                max = Math.max(dp2[i][j], max);
            }
        }
        System.out.println(max);
    }
}
