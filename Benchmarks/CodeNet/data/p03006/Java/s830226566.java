import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static long[] x;
    static long[] y;
    static long[][] diffX;
    static long[][] diffY;
    public static void main(String[] args) {
       N = sc.nextInt();
       x = new long[N];
       y = new long[N];
       for (int i = 0; i<N; i++) {
           x[i] = sc.nextLong();
           y[i] = sc.nextLong();
       }
       diffX = new long[N][N];
       diffY = new long[N][N];
       for(int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               diffX[i][j] = x[j] - x[i];
               diffY[i][j] = y[j] - y[i];
           }
       }
       List<Integer>[] links = new ArrayList[N];
       int best = N+10;
       for (int k = 0; k < N; k++) {
           for (int l = k + 1; l < N; l++) {
               long p = diffX[k][l];
               long q = diffY[k][l];
               //set links
                for(int i=0; i < N; i++) {
                    links[i] = new ArrayList<Integer>();
                }
               for (int i = 0; i < N; i++) {
                   for (int j = i + 1; j < N; j++) {
                       if(con(i,j,p,q)) {
                           links[i].add(j);
                           links[j].add(i);
                       }
                   }
               }
               //BFS
               int ans = 0;
               boolean[] checked = new boolean[N];
               for(int i=0; i < N; i++) {
                   if(checked[i]) continue;
                   ans++;
                   Queue<Integer> queue = new LinkedList<Integer>();                   
                   queue.offer(i);
                   checked[i] = true;
                   while(queue.size() > 0) {
                       int v = queue.poll();
                       for (int w : links[v]) {
                           if(checked[w]) continue;
                            queue.offer(w);
                            checked[w] = true;
                       }
                   }
               }
               //component
               best = Math.min(best,ans);
           }
       }
       System.out.println(best);
    }
    public static boolean con(int i, int j, long p, long q) {
        long deltaX = diffX[i][j];
        long deltaY = diffY[i][j];
        if (p == 0 && q == 0) return false;
        if (p != 0) {
            long c = deltaX / p;
            return (c * p == deltaX && c * q == deltaY);
        } else {
            long c = deltaY / q;
            return (c * p == deltaX && c * q == deltaY);
        }
    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE
}
