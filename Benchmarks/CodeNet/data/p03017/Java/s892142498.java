import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt() - 1;
        int d = in.nextInt() - 1;
        String s = in.next();
        char cs[] = s.toCharArray();

        boolean ok = true;
        for (int i = a; i <= c - 1; i++) {
            if (cs[i] == '#' && cs[i + 1] == '#') {
                ok = false;
            }
        }
        for (int i = b; i <= d - 1; i++) {
            if (cs[i] == '#' && cs[i + 1] == '#') {
                ok = false;
            }
        }

        if (ok && c > d) {
            ok = false;
            for (int i = b - 1; i <= d - 1; i++) {
                if (cs[i] == '.' && cs[i + 1] == '.' && cs[i + 2] == '.') {
                    ok = true;
                    break;
                }
            }
        }

        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}