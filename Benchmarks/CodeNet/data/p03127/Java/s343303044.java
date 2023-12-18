
import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if(a < b) return gcd(b,a);
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer[] a = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        Integer res = a[0];
        for (int i = 0; i < N; i++) {
            res = gcd(res, a[i]);
        }

        System.out.println(res);
    }
}
