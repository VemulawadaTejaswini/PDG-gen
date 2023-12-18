import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private StringBuilder sb;
 
    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }
 
    private void solve() {
        try {
            int sx = scanner.nextInt();
            int sy = scanner.nextInt();
            int tx = scanner.nextInt();
            int ty = scanner.nextInt();
            int dx = tx - sx;
            int dy = ty - sy;
            if (dx < 0) {
                dx *= -1;
            }
            if (dy < 0) {
                dy *= -1;
            }
            sb = new StringBuilder();
            printUDLR(dy, "U");
            printUDLR(dx, "R");
            printUDLR(dy, "D");
            printUDLR(dx+1, "L");
            printUDLR(dy+1, "U");
            printUDLR(dx+1, "R");
            printUDLR(1, "D");
            printUDLR(1, "R");
            printUDLR(dy+1, "D");
            printUDLR(dx+1, "L");
            printUDLR(1, "U");
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printUDLR (int n, String s) {
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
    }
 
    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
 
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }
 
        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }
 
        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
 
        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}