import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long a[] = new Long[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a, Collections.reverseOrder());

        long sum = 0;
        int count = 0;
        for (int i = 1; i < 3 * n; i += 2) {
            if (count == n) {
                break;
            }
            sum += a[i];
            count++;
        }
        System.out.println(sum);
    }
}