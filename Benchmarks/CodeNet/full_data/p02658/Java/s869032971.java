import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Long[] a = new Long[n];
        Long limit = (long)Math.pow(10,18);

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        Arrays.sort(a);

        if (a[0] == 0){
            System.out.print(0);
            System.exit(0);
        }

        Long result = a[0];

        for (int i = 1; i < n; i++) {
            result *= a[i];
            if (result > limit/1) {
                System.out.print(-1);
                System.exit(0);
            }
        }
        System.out.print(result);
    }
}
