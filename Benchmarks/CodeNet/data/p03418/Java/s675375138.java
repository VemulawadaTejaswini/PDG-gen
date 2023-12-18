import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        
        if (k == 0) {
            System.out.println(n * n);
        } else {
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (i - 1 >= k) {
                    c += n / i * (i - k);
                    c += Math.max(0, (n % i) - k + 1);
                }
            }
            System.out.println(c);
        }
    }
}
