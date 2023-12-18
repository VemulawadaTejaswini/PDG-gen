import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long ans = N;

        while (true) {
            long tmp = Math.abs(ans - K);
            if (ans > tmp) {
                ans = tmp;
            } else {
                break;
            }
        }

        System.out.print(ans);

        scanner.close();
    }
}