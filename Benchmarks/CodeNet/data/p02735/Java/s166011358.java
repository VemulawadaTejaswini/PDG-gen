import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int W = s.nextInt();
        String[] str = new String[H];
        char[][] c = new char[H][W];
        int nowH = 0;
        int nowW = 0;
        int count = 0;
        for (int i = 0; i < H; i++) {
            str[i] = s.next();
            c[i] = str[i].toCharArray();
        }

        while (true) {
            if (nowH == H - 1 && nowW == W - 1) break;
            if (nowW < W - 1) {
                if (c[nowH][nowW] == c[nowH][nowW + 1]) {
                    nowW++;
                    continue;
                }
            }
            if (nowH < H - 1) {
                if (c[nowH][nowW]==c[nowH + 1][nowW]) {
                    nowH++;
                    continue;
                }
            }

            if (nowW < W - 1) {
                nowW++;
                count++;
            } else {
                nowH++;
                count++;
            }
        }
        count = count / 2;
        if (c[0][0] == "#".hashCode()) count++;
        System.out.print(count);
    }
}