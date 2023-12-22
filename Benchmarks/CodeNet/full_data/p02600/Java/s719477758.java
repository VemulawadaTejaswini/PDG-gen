import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author:26019
 */
public class Main {


    public static void main(String[] args) throws Exception {
        solve();
    }

    private static void solve() throws Exception {
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\26019\\Downloads\\out.txt"))));
        FastScanner cin = new FastScanner();
        int x = cin.nextInt();
        if (400 <= x && x <= 599) {
            System.out.println(8);
        } else if (600 <= x && x <= 799) {
            System.out.println(7);
        } else if (800 <= x && x <= 999) {
            System.out.println(6);
        } else if (1000 <= x && x <= 1199) {
            System.out.println(5);
        } else if (1200 <= x && x <= 1399) {
            System.out.println(4);
        }else if (1400 <= x && x <= 1599) {
            System.out.println(3);
        }else if (1600 <= x && x <= 1799) {
            System.out.println(2);
        } else if (1800 <= x && x <= 1999) {
            System.out.println(1);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\26019\\Downloads\\P1190_9.in"))));
        StringTokenizer st = new StringTokenizer("");

        FastScanner() throws FileNotFoundException {
        }

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public String nextLine() { // 读取带空格的字符串
            String res = null;
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
