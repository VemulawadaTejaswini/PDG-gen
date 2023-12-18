// n <= mであることが保証されている
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        n = n <= 2 ? 1 : n-2;
        m = m < 2 ? 1 : m - 2;

        long ans = n * m;
        System.out.println(ans);
    }
}
