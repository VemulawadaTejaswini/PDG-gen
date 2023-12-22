import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n + 1];
        Arrays.fill(a, 1);
        for (int i = 2; i <= n; i++) {
            int j = 1;
            while (i * j <= n) {
                a[i * j]++;
                j++;
            }
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * a[i];
        }
        System.out.println(sum);
    }
}
