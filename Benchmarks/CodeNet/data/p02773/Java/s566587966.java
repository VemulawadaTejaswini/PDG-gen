import java.util.Scanner;
import java.util.Arrays;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        int max = 0;
        String s = "";
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i])) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                s = str[i];
                cnt = 0;
            }
        }
        s = "";
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i])) {
                cnt++;
            } else {
                s = str[i];
                cnt = 0;
            }
            if (cnt == max) {
                System.out.println(str[i]);
                cnt = 0;
            }
        }
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
