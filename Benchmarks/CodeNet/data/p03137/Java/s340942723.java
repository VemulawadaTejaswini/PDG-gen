import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] xAbs = new int [m];
        for (int i = 0; i < m - 1; i++) {
            xAbs[i] = Math.abs(x[i] - x[i+1]);
        }
        Arrays.sort(xAbs);
        int sum = 0;
        for (int i = 0; i < xAbs.length - n + 1; i++) {
            sum += xAbs[i];
        }
        System.out.println(sum);
    }
}
