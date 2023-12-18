import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}

    ArrayList<Integer> allZero = new ArrayList<>();

    void solve() throws Exception{
        int N = in.nextInt();
        int diff = 2000;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(), mapr = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                map.put(i + j * diff, cnt);
                mapr.put(cnt, i + j * diff);
                mapr.put(cnt, i + j * diff);
                cnt++;
                list.add(new ArrayList<>());
            }
        }

        int pe1 = -1, pe2 = -1;
        for(int i = 0; i < N; i++){
            pe1 = -1; pe2 = -1;
            for(int j = 0; j < N-1; j++){
                int v = in.nextInt() - 1;
                int e1 = i;
                int e2 = v;

                if(e1 > e2){
                    int tmp = e1;
                    e1 = e2;
                    e2 = tmp;
                }
                if(pe1 != -1){
                    //out.println(i + " " + pe1 + " " + pe2 + " " + e1 + " " + e2);
                    int indexFrom = map.get(pe1 + pe2 * diff);
                    int indexTo = map.get(e1 + e2 * diff);
                    list.get(indexFrom).add(indexTo);
                }
                pe1 = e1;
                pe2 = e2;
            }
        }

        ArrayList<Integer> ts = topologicalSort(list);
        if(ts == null){
            out.println("-1");
            return;
        }

        int[] dp = new int[ts.size()+1];
        Arrays.fill(dp, 0);
        //dp[0] = 1;
        for(int e : allZero){
            dp[e] = 1;
        }
        for(int i = 0; i < ts.size()-1; i++){
            int from = mapr.get(ts.get(i)), to = mapr.get(ts.get(i+1));
            int f1 = from % diff, f2 = from / diff;
            int t1 = to % diff, t2 = to / diff;
            //out.println(f1 + " " + f2 + " " + t1 + " " + t2);

            if(f1 != t1 && f2 != t2){
                dp[i+1] = Math.max(dp[i+1], dp[i]);
            }else{
                dp[i+1] = Math.max(dp[i+1], dp[i]+1);
            }
        }

        out.println(dp[ts.size()-1]);
    }

    ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> g){
        //グラフの頂点数
        int n = g.size();
        //各頂点の入次数
        int[] num = new int[n];
        //入次数が0の頂点集合
        Deque<Integer> zeroVertexes = new ArrayDeque<Integer>();
        //ソート済みの頂点集合
        ArrayList<Integer> sortedVertexes = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            for(int to : g.get(i)){
                num[to]++;
            }
        }

        for(int i = 0; i < n; i++){
            if(num[i] == 0){
                zeroVertexes.addFirst(i);
                allZero.add(i);
            }
        }

        while(!zeroVertexes.isEmpty()){
            int v = zeroVertexes.removeFirst();
            sortedVertexes.add(v);
            for(int next : g.get(v)){
                num[next]--;
                if(num[next] == 0) zeroVertexes.addFirst(next);
            }
        }

        //(sortedList.size() != n)なら閉路が存在する(acyclicではない)
        if(sortedVertexes.size() != n) return null;
        else return sortedVertexes;
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
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