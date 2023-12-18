import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int data = i;
            while (true) {
                if (data > k) {
                    break;
                }
                data = data * 2;
                count++;
            }
            double temp = (double) 1 / Math.pow(2, count) * (double) 1 / (double) n;
            ans = ans + temp;
        }
        System.out.println(ans);
    }
}
