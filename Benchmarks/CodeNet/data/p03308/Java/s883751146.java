import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        Arrays.sort(a);
        System.out.println(a[n - 1] - a[0]);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
