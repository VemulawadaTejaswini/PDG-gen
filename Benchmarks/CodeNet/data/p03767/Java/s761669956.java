import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // AGC027A - Candy Distribution Again

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 2 <= n <= 10^5
        Integer[] a = new Integer[n * 3]; // 1 <= a <= 10^9

        for (int i = 0; i < n * 3; i++) {
            a[i] = sc.nextInt();
        }

        //Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(a);

        long sum = 0;
        for (int j = n; j < n * 2; j++) {
            sum += a[j];
        }

        System.out.println(sum);
    }

}