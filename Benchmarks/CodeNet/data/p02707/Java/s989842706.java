import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] ans = new int[n];
        for (int i = 2; i <= n; i++) {
            final int a = sc.nextInt();
            ans[a-1]++;
        }

        Arrays.stream(ans).forEach(System.out::println);
    }
}
