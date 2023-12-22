import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        int [] [] a = new int[n][m];
        int [] [] b = new int[m][l];
        int [] [] c = new int[n][l];
        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                a[x] [y] = scan.nextInt();
            }
        }
        for(int x = 0; x < m; x++){
            for(int y = 0; y < l; y++){
                b[x] [y] = scan.nextInt();
            }
        }
        for(int x =0; x < n; x++){
            for(int y = 0; y < l; y++){
                for(int r = 0; r < m; r++){
                    c[x][y] = c[x][y] + (a[x][r] * b[r][y]);
                }
            }
        }
        for(int x = 0; x < n; x++){
            for(int y = 0; y < l; y++){
                System.out.print(c[x] [y] + " ");
            }
            System.out.println();
        }
    }
}
