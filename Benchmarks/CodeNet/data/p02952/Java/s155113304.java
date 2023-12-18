import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int count = (int) Math.ceil(Math.log10(n));
        int ans = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {
                continue;
            }

            if (i == count) {
                int base = (int) Math.pow(10, count - 1);
                int last;
                if (n % base == 0) {
                    last = n - base;
                } else {
                    last = n - base + 1;
                }
                ans += last;
            } else {
                int base = (int) Math.pow(10, i);
                ans += base - Math.pow(10, i - 1);
            }
        }
        System.out.println(ans);
    }
}
