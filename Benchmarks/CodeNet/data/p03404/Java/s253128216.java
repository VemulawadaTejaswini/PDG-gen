import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        char[][] map = new char[100][100];
        char print;
        if (a <= b) {
            fill(map, '.');
            a--;
            print = '#';
            int tmp = a;
            a = b;
            b = tmp;
        } else {
            fill(map, '#');
            b--;
            print = '.';
        }
        
        draw(map, a, print);
        drawLeftover(map, b, print);
        out.print(100 + " ");
        out.print(100 + " ");
        out.println();
        print(map);
    }

    private void print(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                out.print(map[i][j]);
            }
            out.println();
        }
    }

    private void drawLeftover(char[][] map, int b, char print) {
        int start = 0;
        for (int i = 1; b > 0; i+=2) {
            int firstNotJoined = -1;
            int lastNotJoined = -1;
            for (int j = start; j < map.length && b > 0; j+=2) {
                map[i][j] = print;
                b--;
                if (!joined(map, i, j, print)) {
                    if (firstNotJoined == -1) firstNotJoined = j;
                    lastNotJoined = j;
                }
            }
            join(map, i, firstNotJoined, lastNotJoined, print);
            start = start == 1 ? 0 : 1;
        }
    }

    private void join(char[][] map, int i, int firstNotJoined, int lastNotJoined, char print) {
        if (firstNotJoined == -1) return;
        if (firstNotJoined == map.length - 1) {
            map[i][firstNotJoined - 1] = print;
        } else {
            map[i][firstNotJoined + 1] = print;
        }
        if (firstNotJoined == lastNotJoined) return;
        int iFill = i + 1;
        for (int k = firstNotJoined; k <= lastNotJoined; k++) {
            map[iFill][k] = print;
        }
    }

//    private void join(char[][] map, int i, int j, char print) {
//        if (j == map.length - 1) {
//            map[i][j - 1] = print;
//        } else {
//            map[i][j+1] = print;
//        }
//        int iFill = i + 1;
//        int upto = j % 2 == 0 ? map.length - 1 : map.length;
//        for (int k = j; k < upto; k++) {
//            map[iFill][k] = print;
//        }
//    }

    private boolean joined(char[][] map, int i, int j, char print) {
        return map[i+1][j] == print || (j > 0 && map[i][j-1] == print);
    }

    private void draw(char[][] map, int a, char print) {
        int start = 1;
        for (int i = 0; a > 0; i+=2) {
            for (int j = start; j < map.length && a > 0; j+=2) {
                map[i][j] = print;
                a--;
            }
            start = start == 1 ? 0 : 1;
        }
    }

    private void fill(char[][] map, char c) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = c;
            }
        }
    }


    Scanner in;
    PrintWriter out;

    void run() {
        try {
            in = new Scanner(new File("A.in"));
            out = new PrintWriter(new File("A.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new Scanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public Scanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private int skip() {
            int b;
            while ((b = read()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        private int read() {
            int res = -1;
            try {
                res = br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        char[] nextCharArray(int size) {
            char[] buf = new char[size];
            int b = skip(), p = 0;
            while (p < size && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = read();
            }
            return size == p ? buf : Arrays.copyOf(buf, p);
        }

        char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextCharArray(m);
            }
            return map;
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}