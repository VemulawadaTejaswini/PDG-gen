import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[] x = new long[N];
        long[] accum = new long[N];
        long add = 100000000;
        long sum = 0;
        int L = -1;
        int R = -1;
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextLong();
            sum += x[i];
            accum[i] = sum;
            if (x[i] <= 0) {
                L = i;
            }
            if (x[i] > 0 && R == -1) {
                R = i;
            }
        }

        long min = Long.MAX_VALUE;

        // L
        if (L != -1) {
            for (int i = 0; i < K; i++) {
                if (L-i < 0) {
                    continue;
                }
                long dist = 0;
                // L
                if (i == (K -1)) {
                    dist += Math.abs(x[L-i]);
                } else {
                    dist += Math.abs(x[L-i] * 2);
                }
                //System.out.println("L"+i + " add L="+dist);

                // R
                if (i != (K-1)) {
                    int rest = K - i -2;
                    if (R == -1 || R + rest >= x.length) {
                        continue;
                    }
                    dist += x[R + rest];
                    //System.out.println("L"+i+ " add R="+x[R + rest] + " rest="+rest + " R+rest=" + (R+rest));
                }
                //System.out.println("L dist="+dist);
                min = Math.min(min, dist);
            }
        }

        // R
        if (R != -1) {
            for (int i = 0; i < K; i++) {
                if (R+i >= K) {
                    continue;
                }
                long dist = 0;
                // R
                if (i == (K -1)) {
                    dist += Math.abs(x[R+i]);
                    //System.out.println("R"+i+ " dist="+dist + " 1");
                } else {
                    dist += Math.abs(x[R+i] * 2);
                    //System.out.println("R"+i+ " dist="+dist + " 2");
                }

                // L
                if (i != (K-1)) {
                    int rest = K - i;
                    if (L == -1 || L-rest < 0) {
                        continue;
                    }
                    dist += Math.abs(x[L- rest]);
                    //System.out.println("R"+i+ " add L="+x[L + rest] + " rest="+rest + " L+rest=" + (L+rest));
                }
                //System.out.println("R dist="+dist);
                min = Math.min(min, dist);
            }
        }

        System.out.println(min);
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
