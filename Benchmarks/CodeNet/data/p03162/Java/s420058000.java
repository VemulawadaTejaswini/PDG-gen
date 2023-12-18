import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int res[][] = new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                a[i][j] = sc.nextInt();
                if(i == n-1) {
                    res[i][j] = a[i][j];
                }
            }
        }
        for(int i=n-2;i>=0;i--) {
            for(int j=0;j<3;j++) {
                if(j==0) {
                    res[i][j] = a[i][j] + Math.max(res[i+1][1], res[i+1][2]);
                }
                else if(j==1) {
                    res[i][j] = a[i][j] + Math.max(res[i+1][0], res[i+1][2]);
                }
                else if(j==2) {
                    res[i][j] = a[i][j] + Math.max(res[i+1][1], res[i+1][0]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j=0;j<3;j++) {
            max = Math.max(max, res[0][j]);
        }
        System.out.println(max);
    }
}
