import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] d = new int[c][c];
        int[][] b = new int[n][n];
        int[][] f = new int[3][c];

        for(int i=0; i<c; i++) {
            for(int j=0; j<c; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                b[i][j] = sc.nextInt() - 1;
                f[(i+j)%3][b[i][j]]++;
            }
        }

        long res = Long.MAX_VALUE;
        for(int i=0; i<c; i++) {
            for(int j=0; j<c; j++) {
                if(i==j) continue;
                for(int k=0; k<c; k++) {
                    if(j==k || i==k) continue;
                    long score = 0;
                    for(int m=0; m<c; m++) {
                        score += d[m][i] * f[0][m];
                        score += d[m][j] * f[1][m];
                        score += d[m][k] * f[2][m];
                    }
                    res = Math.min(res, score);
                }
            }
        }


        System.out.println(res);
    }

}
