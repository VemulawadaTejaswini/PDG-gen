import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = new char[n];

        for (int i = 0; i < n; i++) {
            a[i] = 'x';
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            char c = sc.next().charAt(0);
            if (a[s] == 'x' || a[s] == c) {
                a[s] = c;
            } else {
                System.out.println("-1");
                System.exit(0);
            }
        }

        if ((a[0] == '0' || a[0] == 'x') && n == 1) {
            a[0] = '0';
        } else if(m == 0) {
            System.out.println("0");
            System.exit(0);
        } else if (a[0] == '0') {
            System.out.println("-1");
            System.exit(0);
        } else if (a[0] == 'x') {
            a[0] = '1';
        }
        System.out.println(String.valueOf(a).replace("x", "0"));
    }
}
