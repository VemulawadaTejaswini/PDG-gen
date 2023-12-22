import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int col = scan.nextInt();

        int[][] a = new int[r][col];
        int[][] b = new int[col][1];
        int[][] c = new int[r][1];
        scan.nextLine();

        for (int i = 0; i < a.length;i++) {
            for(int j = 0;j < a[0].length;j++) {
                a[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }
        for (int i = 0; i < b.length;i++) {
            b[i][0] = scan.nextInt();
            scan.nextLine();
        }
        for (int i = 0; i < a.length;i++) {
            int t = 0;
            for (int j = 0; j < a[0].length;j++) {
                t += a[i][j] * b[j][0];
                c[i][0] = t;
            }
        }
        for (int i = 0; i < c.length; i++) {
         System.out.println(c[i][0]);
        }
    }
}