import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(A B C)
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println((isConnect(a, b) && isConnect(b, c)) ? "YES" : "NO");
        sc.close();
    }

    private static boolean isConnect(final String x, final String y) {
        return x.charAt(x.length() - 1) == y.charAt(0);
    }
}
