import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[][] max = new int[n][3];
        for (int i = 0 ; i < n ; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        max[0][0] = a[0];
        max[0][1] = b[0];
        max[0][2] = c[0];
        for (int i = 1 ; i < n ; i++) {
            max[i][0] = Math.max(max[i-1][1], max[i-1][2]) + a[i];
            max[i][1] = Math.max(max[i-1][0], max[i-1][2]) + b[i];
            max[i][2] = Math.max(max[i-1][0], max[i-1][1]) + c[i];
        }
        System.out.println(Math.max(max[n-1][0], Math.max(max[n-1][1], max[n-1][2])));
    }
}
