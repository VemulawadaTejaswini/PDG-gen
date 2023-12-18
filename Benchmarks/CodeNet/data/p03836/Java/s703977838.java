import java.io.*;
import java.util.*;

public class Main {
    private static String repeat(String s, int n) {
        return new String(new char[n]).replace("\0", s);
    }
    public static void main(String[] args) {
        // @DONE

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        // First move up
        StringBuilder ret = new StringBuilder();

        ret.append(repeat("U", Math.max(0, y2 - y1)));
        ret.append(repeat("R", Math.max(0, x2 - x1)));
        ret.append(repeat("D", Math.max(0, y2 - y1)));
        ret.append(repeat("L", Math.max(0, x2 - x1)));

        ret.append("L");
        ret.append(repeat("U", Math.max(0, y2 - y1 + 1)));
        ret.append(repeat("R", Math.max(0, x2 - x1 + 1)));
        ret.append("DR");
        ret.append(repeat("D", Math.max(0, y2 - y1 + 1)));
        ret.append(repeat("L", Math.max(0, x2 - x1 + 1)));
        ret.append("U");

        System.out.println(ret.toString());
    }
}
