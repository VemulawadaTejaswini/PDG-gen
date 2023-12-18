import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                x -= m;
                ans++;
                if (m < min) {
                    min = m;
                }
            }
            ans += x / min;

            System.out.println(ans);
        }
    }

}
