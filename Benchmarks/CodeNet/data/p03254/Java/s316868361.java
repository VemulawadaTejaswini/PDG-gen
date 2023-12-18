import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AGC027A - Candy Distribution Again

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 2 <= n <= 100
        int x = sc.nextInt(); // 1 <= x <= 10^9
        int[] a = new int[n]; // 1 <= a <= 10^9

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //Arrays.sort(s, Collections.reverseOrder());
        Arrays.sort(a);

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (x >= a[j]) {
                ++count;
                x -= a[j];
            }
        }
        if (count > 0 && x > 0) --count;

        System.out.println(count);
    }

}