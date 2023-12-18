
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] height = new long[n];
        for (int i = 0; i < n; ++i) {
            height[i] = scanner.nextLong();
        }
        for (int i = 0; i < n - 1; ++i) {
            if (i == 0 || height[i] - 1 >= height[i - 1]) {
                --height[i];
            }
            if (i - 1 >= 0 && height[i] < height[i - 1]) {
                System.out.println("No");
                return;
            }
            //Arrays.stream(height).forEach(System.out::println);
        }
        if (n - 2 >= 0 && height[n - 1] < height[n - 2]) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
