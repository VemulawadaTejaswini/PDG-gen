import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = 1000000007;
        long ans = 0;
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                long tmp = array[i] * array[j + 1];
                ans += tmp;
            }
        }
        System.out.println(ans % A);
    }
}
