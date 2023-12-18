import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] xA = new int[n];
        int[] yA = new int[m];

        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            yA[i] = sc.nextInt();
        }

        Arrays.sort(xA);
        Arrays.sort(yA);

        int z = 101;
        if (xA[n - 1] <= yA[0]) {
            z = (xA[n - 1] + yA[0]) / 2;
        }

        if (x < z && y >= z) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}
