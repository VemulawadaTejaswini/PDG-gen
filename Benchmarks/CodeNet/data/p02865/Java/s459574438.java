import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int left = 1;
        int right = n - 1;
        if (n < 2) {
            System.out.println(0);
            return;
        }

        long ans = 0;
        while (left < right) {
            left++;
            right--;
            ans++;
        }

        System.out.println(ans);
    }
}
