import java.util.Scanner;

/**
 * Created by dezhonger on 2019/4/13
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int r = 0;
        for (int i = 0; i < n ;i++) {
            max = Math.max(max, a[i]);
            if (max == a[i]) r++;
        }
        System.out.println(r);
    }
}
