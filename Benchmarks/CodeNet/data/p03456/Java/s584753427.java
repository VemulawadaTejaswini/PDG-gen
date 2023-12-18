import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // aとbを結合
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        double n = Double.parseDouble(sb.toString());
        out.println(Main.checksqrt(n));
        out.close();
        sc.close();
    }

    /**
     * 引数が平方数かどうか判定
     * @param pnum
     * @return 平方数の場合は"Yes"、それ以外は"No"
     */
    private static String checksqrt(double pnum) {
        // 引数の平方根を求める
        double n = Math.sqrt(pnum);
        // 引数を平方根で割った余りが0ならば平方数
        if (pnum % n == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
