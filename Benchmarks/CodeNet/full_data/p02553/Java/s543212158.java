import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        boolean neg1 = b < 0;
        boolean neg2 = d < 0;
        long ans;
        if (neg1 ^ neg2) {
            ans = Math.max(b * c, a * d);
            if (!neg1 && a <= 0) {
                ans = 0;
            }
            if (!neg2 && c <= 0) {
                ans = 0;
            }
        } else if (neg1 && neg2) {
            ans = a * c;
        } else {
            ans = b * d;
        }
        System.out.println(ans);
    }
}