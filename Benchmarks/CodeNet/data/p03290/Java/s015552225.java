import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();main.solve(args);
    }

    int D;
    int G;
    int[] p;
    int[] c;
    int minCount = Integer.MAX_VALUE;
    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        D = scanner.nextInt();
        G = scanner.nextInt();
        p = new int[D];
        c = new int[D];
        for (int i = 0; i < D; i++) {
            p[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }
        s(0, 0, 0);
        System.out.println(minCount);
    }

    private void s(int solvedCount, int currentPoint, int currentI) {
        if (currentI == D) {
            if (currentPoint >= G) {
                minCount = Math.min(solvedCount, minCount);
            }
            return;
        }
        for (int i = 0; i <= p[currentI]; i++) {
            int addPoint = ((currentI + 1) * 100) * i;
            if (i == p[currentI]) {
                addPoint += c[currentI];
            }
            s(solvedCount + i, currentPoint + addPoint, currentI + 1);
        }
    }

    private class MyScanner {
        String[] s;int i;BufferedReader br;String reg = " ";
        MyScanner () { s = new String[0];i = 0;br = new BufferedReader(new InputStreamReader(System.in)); }
        public String next() {
            try {
                if (i < s.length) return s[i++]; String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0); i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}

