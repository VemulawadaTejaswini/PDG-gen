import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        boolean endFlg = false;
        String result = "-1 -1 -1";

        for (Integer i = 0; i < N; i++) {
            for (Integer j = 0; j < N - i; j++) {
                for (Integer k = 0; k < N - i - j; k++) {
                    if (10000 * i + 5000 * j + 1000 * k == Y) {
                        result = i.toString() + " " + j.toString() + " " + k.toString();
                        endFlg = true;
                        break;
                    }
                    if (endFlg) {
                        break;
                    }
                }
                if (endFlg) {
                    break;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);

        sc.close();
        out.flush();
    }
}