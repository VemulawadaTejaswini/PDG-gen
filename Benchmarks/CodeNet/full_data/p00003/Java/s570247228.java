import java.io.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int num = 0;
        // データ読み込み
        while ((line = in.readLine()) != null && num <= 1000) {
            if (num != 0) {
                int b = Integer.parseInt(line.split(" ")[0]);
                int c = Integer.parseInt(line.split(" ")[1]);
                int d = Integer.parseInt(line.split(" ")[2]);
                if (b > c && b > d) {
                    checkTriangle(b, c, d);
                } else if (c > b && c > d) {
                    checkTriangle(c, b, d);
                } else {
                    checkTriangle(d, b, c);
                }
            }
            num++;
        }
    }

    private static void checkTriangle(int along, int aShort1, int aShort2) {
        if ((along ^ 2) == (aShort1 ^ 2 + aShort2 ^ 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}