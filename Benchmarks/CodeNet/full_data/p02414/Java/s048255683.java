import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int l = scn.nextInt();

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] c = new long[n][l];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                b[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++){
                    c[i][j]+= (a[i][k] * b[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d",c[i][0]);
            for(int j=1;j<l;j++){
                System.out.printf(" %d",c[i][j]);
            }
            System.out.printf("%n");
        }


        scn.close();


    }


}
