
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String flag = "1";

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    static int[] warpx = { -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 };
    static int[] warpy = { -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2 };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int w = Integer.parseInt(scan.next());
        int ch = Integer.parseInt(scan.next());
        int cw = Integer.parseInt(scan.next());
        int dh = Integer.parseInt(scan.next());
        int dw = Integer.parseInt(scan.next());
        ch--;
        cw--;
        dh--;
        dw--;
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = scan.next().split("");
        }
        scan.close();

        long ans = 0;

        Deque<Pair> stack = new ArrayDeque<Pair>();
        s[ch][cw] = flag;
        stack.push(new Pair(ch, cw));

        while (true) {
            List<Pair> warpList = new ArrayList<Pair>();
            while (!stack.isEmpty()) {
                Pair p = stack.poll();

                for (int i = 0; i < dx.length; i++) {
                    int x = p.h + dx[i];
                    int y = p.w + dy[i];

                    if (x == dh && y == dw) {
                        System.out.println(ans);
                        return;
                    }

                    if (0 <= x && x < h && 0 <= y && y < w) {
                        if (s[x][y].equals(".")) {
                            s[x][y] = flag;
                            stack.push(new Pair(x, y));
                        }
                    }
                }

                warpList.add(p);
            }

            ans++;
            for (Pair p : warpList) {
                for (int i = 0; i < warpx.length; i++) {
                    int x = p.h + warpx[i];
                    int y = p.w + warpy[i];
                    if (0 <= x && x < h && 0 <= y && y < w) {
                        if (x == dh && y == dw) {
                            System.out.println(ans);
                            return;
                        }

                        if (s[x][y].equals(".")) {
                            s[x][y] = flag;
                            stack.push(new Pair(x, y));
                        }
                    }
                }
            }

            if (stack.isEmpty()) {
                break;
            }
        }
        System.out.println(-1);
    }

    static class Pair {
        int h;
        int w;

        public Pair(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }
}
