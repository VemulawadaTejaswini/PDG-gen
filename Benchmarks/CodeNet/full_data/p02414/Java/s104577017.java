import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[m][l];
        long c[][] = new long[n][l];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < l;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                c[i][j] = 0;
                for(int k = 0;k < m;k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < l;j++){
                if(j == l - 1){
                    System.out.print(c[i][j]);
                }else{
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
