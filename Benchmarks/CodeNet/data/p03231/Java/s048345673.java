import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int l = lcm(n, m);
        char[] x = new char[l];
        for (int i = 0; i < n; i++) {
            x[i * l / n] = s.charAt(i);
        }
        for (int i = 0; i < m; i++) {
            if (x[i * l / m] != '\u0000' && x[i * l / m] != t.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(l);
    }

}
