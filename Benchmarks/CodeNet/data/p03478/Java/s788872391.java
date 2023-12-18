import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                if (a <= i && i <= b) {
                    ans += i;
                }
            } else if (i < 100) {
                int x = i / 10;
                int y = i % 10;
                int sum = x + y;
                if (a <= sum && sum <= b) {
                    ans += i;
                }
            } else if (i < 1000) {
                int x = i / 100;
                int y = (i / 10) % 10;
                int z = i % 10;
                int sum = x + y + z;
                if (a <= sum && sum <= b) {
                    ans += i;
                }
            } else if (i < 10000) {
                int x = i / 1000;
                int y = (i / 100) % 10;
                int z = (i / 10) % 10;
                int w = i % 10;
                int sum = x + y + z + w;
                if (a <= sum && sum <= b) {
                    ans += i;
                }
            } else {
                if (a == 1) {
                    ans += i;
                }
            }
        }
        System.out.println(ans);
    }
}