import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        b();
    }

    private static void b() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int c = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(sc.next());
            if (h >= max) {
                c++;
                max = h;
            }
        }
        p(c);
    }

    private static void p(Object x) {
        System.out.println(x.toString());
    }
}
