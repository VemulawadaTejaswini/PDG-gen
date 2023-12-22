import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a[][] = new int[n][m];
        int b[] = new int[m];
        int c = 0;
        for (int i =0; i < n; i++) {
            for (int j =0; j < m; i++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i =0; i < m; i++) {
            b[i] =scan.nextInt();
        }
        for (int i =0; i < n; i++) {
            for (int j =0; j < m; j++) {
            c = c + a [i][j] * b[j];
            }
            System.out.println(c);
            c = 0;         
        }
    }
}