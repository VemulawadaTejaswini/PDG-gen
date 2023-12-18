import java.util.Scanner;

public class Main {

    public static final void main(String args[]) {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            long x = in.nextLong();
            long a = (x / 11) * 2;
            x %= 11;
            while (true) {
                ++a;
                x -= 6;
                if (x <= 0) break;
                ++a;
                x -= 5;
                if (x <= 0) break;
            }
            System.out.println(a);
        }
    }
}
