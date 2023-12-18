import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Integer a[] = new Integer[4];
        a[0] = null; a[1] = null; a[2] = null; a[3] = null;

        for (int i = 0; i < m; i++) {
            int s = scan.nextInt();
            int c = scan.nextInt();
            if (a[s] == null || a[s] == c) {
                a[s] = c;
            } else {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < 1000; i++) {
            String s = String.valueOf(i);
            int len = s.length();
            while (s.length() < 3) {
                s = "0".concat(s);
            }
            if (len == n &&
                (a[1] == null || Integer.valueOf(s.substring(0,1)) == a[1]) &&
                len >= 2 && (a[2] == null || Integer.valueOf(s.substring(1,2)) == a[2]) &&
                len >= 3 && (a[3] == null || Integer.valueOf(s.substring(2,3)) == a[3])) {
                    System.out.println(i);
                    return;
                }
        }

        System.out.println(-1);
    }
}
