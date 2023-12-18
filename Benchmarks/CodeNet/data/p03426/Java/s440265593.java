import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
        public static void main(String[] args) {
                InputStream inputStream = System.in;
                OutputStream outputStream = System.out;
                InputReader in = new InputReader(inputStream);
                PrintWriter out = new PrintWriter(outputStream);
                TaskD solver = new TaskD();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskD {
                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        Map<Integer, TaskD.Point> map = new HashMap<>();
                        int h = in.i();
                        int w = in.i();
                        int d = in.i();
                        for (int i = 0; i <= h * w + 5; i++) {
                                map.put(i, new TaskD.Point());
                        }
                        for (int i = 0; i < h; i++) {
                                for (int j = 0; j < w; j++) {
                                        int x = in.i();
                                        map.get(x).x = i;
                                        map.get(x).y = j;
                                }
                        }
                        long[] dis = new long[90002];
                        for (int i = d + 1; i <= h * w; i++) {

                                dis[i] = dis[i - d] + Math.abs(map.get(i).x - map.get(i - d).x) + Math.abs(map.get(i).y - map.get(i - d).y);
                        }
                        int q = in.i();
                        while (q-- > 0) {
                                int a = in.i();
                                int b = in.i();
                                out.println(dis[b] - dis[a]);
                        }
                }

                static class Point {
                        int x;
                        int y;

                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
                        if (lenbuf == -1) throw new InputMismatchException();
                        if (ptrbuf >= lenbuf) {
                                ptrbuf = 0;
                                try {
                                        lenbuf = is.read(inbuf);
                                } catch (IOException e) {
                                        throw new InputMismatchException();
                                }
                                if (lenbuf <= 0) return -1;
                        }
                        return inbuf[ptrbuf++];
                }

                public int i() {
                        int num = 0, b;
                        boolean minus = false;
                        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
                        if (b == '-') {
                                minus = true;
                                b = readByte();
                        }

                        while (true) {
                                if (b >= '0' && b <= '9') {
                                        num = num * 10 + (b - '0');
                                } else {
                                        return minus ? -num : num;
                                }
                                b = readByte();
                        }
                }

        }
}

