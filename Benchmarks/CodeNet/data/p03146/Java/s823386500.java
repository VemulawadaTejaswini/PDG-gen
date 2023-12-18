import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(s);
        for (int i = 1, answer = 0;; i++) {
            answer = Main.calcF(list.get(i - 1));
            if (list.contains(answer)) {
                out.println(i + 1);
                break;
            }
            list.add(answer);
        }
        out.close();
        sc.close();
    }

    private static int calcF(int pnum) {
        int n = pnum;
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }
}
