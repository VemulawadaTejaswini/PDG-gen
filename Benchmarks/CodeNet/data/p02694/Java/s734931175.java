import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        scanner.close();

        long sum = 100l;
        long ans = 0l;
        while (true) {
            sum = (long) (sum * 1.01);
            ans++;
            if (sum >= X) {

                break;
            }
        }
        System.out.println(ans);
    }
}
