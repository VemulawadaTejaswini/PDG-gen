
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] x;

    public static void main(String[] args) {
        n = sc.nextInt();
        x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            x[i] = num;
            y[i] = num;

        }
        Arrays.sort(x);
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            if (y[i] <= x[mid - 1]) {
                System.out.println(x[mid]);
            } else {
                System.out.println(x[mid - 1]);
            }
        }
    }
}
