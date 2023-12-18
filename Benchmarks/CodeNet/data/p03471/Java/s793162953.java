import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        boolean endFlg = false;
        String result = "-1 -1 -1";

        for (Integer i = N; i >= 0; i--) {
            for (Integer j = N - i; j >= 0; j--) {
                for (Integer k = N - i - j; k >= 0; k--) {
                    if (10000 * k + 5000 * j + 1000 * i == Y) {
                        result = k.toString() + " " + j.toString() + " " + i.toString();
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