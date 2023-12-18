import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();

        int rgb = Integer.parseInt(r + g + b);

        if (rgb % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
