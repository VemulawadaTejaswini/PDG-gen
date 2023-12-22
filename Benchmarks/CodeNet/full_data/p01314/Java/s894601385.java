import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int ans = 0;
            for (int i = 1; i <= n / 2; i++) {
                int sum = i;
                for (int j = i + 1; j < n; j++) {
                    sum += j;
                    if (sum == n) {
                        ans++;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}