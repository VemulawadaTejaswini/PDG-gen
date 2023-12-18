import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int sx = Integer.parseInt(sc.next());
        int sy = Integer.parseInt(sc.next());
        int tx = Integer.parseInt(sc.next());
        int ty = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int w = tx - sx;
        int h = ty - sy;

        StringBuilder sb = new StringBuilder();
        sb.append(repeatStr("U", h));
        sb.append(repeatStr("R", w));
        sb.append(repeatStr("D", h));
        sb.append(repeatStr("L", w));
        sb.append("L");
        sb.append(repeatStr("U", h + 1));
        sb.append(repeatStr("R", w + 1));
        sb.append("DR");
        sb.append(repeatStr("D", h + 1));
        sb.append(repeatStr("L", w + 1));
        sb.append("U");

        String result = sb.toString();

        // 出力
        System.out.println(result);
    }

    public static String repeatStr(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
