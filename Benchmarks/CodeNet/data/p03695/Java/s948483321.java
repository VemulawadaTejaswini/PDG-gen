import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    List ex;

    private void solve() {
        int N = sc.nextInt();
        ex = new ArrayList<>();
        int base = 0;
        int exNum = 0;
        Set used = new HashSet();
        for (int i = 0; i < N; i++) {
            String s = getRate(sc.nextInt());
            if ("EX".equals(s)) {
                exNum++;
                continue;
            }
            used.add(s);
        }

        base = used.size();
        if (0 < base) {
            System.out.println(base + " " + (base + exNum));
        } else {
            System.out.println(1 + " " + exNum);
        }
    }

    private String getRate(int r) {
        String ret = "";

        if (1 <= r && r <= 399) {

        } else if (400 <= r && r <= 799) {
            ret = "A";
        } else if (800 <= r && r <= 1199) {
            ret = "B";
        } else if (1200 <= r && r <= 1599) {
            ret = "C";
        } else if (1600 <= r && r <= 1999) {
            ret = "D";
        } else if (2000 <= r && r <= 2399) {
            ret = "E";
        } else if (2400 <= r && r <= 2799) {
            ret = "F";
        } else if (2800 <= r && r <= 3199) {
            ret = "G";
        } else {
            ret = "EX";
        }
        return ret;
    }
}
