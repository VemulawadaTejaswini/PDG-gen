import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long sum = ((long)(n) * (long)(n + 1)) / 2;
        long tmp = sum;

        long a = 1;
        for (int i = n; i >= k; i--) {
            if ((tmp - i) > 0) {
                a += n + (n - i + 1);
            } else {
                a += tmp;
            }
            tmp = tmp - 1;
        }
        System.out.print(a % ((long) (Math.pow(10, 9) + 7)));
    }

}