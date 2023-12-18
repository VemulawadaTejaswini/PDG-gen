import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    private FastScanner in = new FastScanner(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}

    void solve() throws Exception{
        int N = in.nextInt(), K = in.nextInt();
        int[] P = in.nextIntArray(N);
        MultiSet<Integer> set = new MultiSet<>();
        for(int i = 0; i < K; i++) set.add(P[i]);

        if(N == K){
            out.println("1");
            return;
        }

        int min = -1, max = -1, cnt = 0;
        for(int i = K; i < N; i++){
            set.add(P[i]);
            min = set.first();
            max = set.last();
            //out.println(min + " " + max + " " + P[i-K] + " " + P[i]);
            if(min == P[i-K] || max == P[i]){
                cnt++;
            }
            set.remove(P[i]);
        }
        out.println(cnt);
    }

    class MultiSet<T extends Comparable<T>>{
        TreeMap<T, Integer> map = new TreeMap<>();
        int num = 0;

        public int add(T e){
            map.put(e, map.getOrDefault(e, 0) + 1);
            num++;
            return map.get(e);
        }

        public int add(T e, int n){
            map.put(e, map.getOrDefault(e, 0) + n);
            num += n;
            return map.get(e);
        }

        //要素eが集合に含まれない<=>mapにeのマッピングは存在しない
        public boolean remove(T e){
            if(!map.containsKey(e)) return false;
            int c = map.get(e);
            if(c == 1) map.remove(e);
            else map.put(e, c - 1);
            num--;
            return true;
        }

        public boolean remove(T e, int n){
            if(map.getOrDefault(e, 0) < n) return false;
            int c = map.get(e);
            if(c == n) map.remove(e);
            else map.put(e, c - n);
            num -= n;
            return true;
        }

        public boolean delete(T e){
            if(!map.containsKey(e)) return false;
            num -= map.get(e);
            map.remove(e);
            return true;
        }

        public int count(T e){return map.getOrDefault(e, 0);}
        public int size(){return num;}//map.size()ではなく、集合に追加された要素数を返す
        public boolean isEmpty(){return map.isEmpty();}
        public boolean contains(T e){return map.containsKey(e);}

        public T lower(T e){return map.lowerKey(e);}                    //max(<e)
        public T higher(T e){return map.higherKey(e);}                  //min(e<)
        public T floor(T e){return map.floorKey(e);}                    //max(<=e)
        public T ceiling(T e){return map.ceilingKey(e);}                //min(e<=)
        public T first(){return this.isEmpty() ? null : map.firstKey();}//min
        public T last(){return this.isEmpty() ? null : map.lastKey();}  //max
    }

    //end solve

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    private void m() throws Exception {
        solve();
        out.flush();
    }

    static class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

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

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        public Long[] nextWrapperLongArray(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public Long[] nextWrapperLongArrayDec(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public Long[] nextWrapperLongArray1Index(int n) {
            Long[] res = new Long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
    }
}