
import java.io. *;
import java.util.*;
import static java.lang.Math.*;
public class MAIN {

    static int visited[];
    static ArrayList<ArrayList<Integer>> adjlist;

    static class Graph{
        int n;
        LinkedList<Integer> queue;
        public Graph(int n) {
            this.n = n;
            queue = new LinkedList<>();
            adjlist = new ArrayList<>(n);
            for(int i=0; i<n; i++){
                ArrayList<Integer> item = new ArrayList<>();
                adjlist.add(i,item);
            }
        }
        void addedge(int u, int v){
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
        int BFS(int src){

            queue = new LinkedList<>();
            queue.add(src);
            visited[src] = 1;
            int lycan = 1;
            int vampire = 0;
            while (!queue.isEmpty()){
                int u = queue.poll();

                for(int i=0; i<adjlist.get(u).size(); i++){
                    if(visited[adjlist.get(u).get(i)]==0){
                        if(visited[u]==2){
                            visited[adjlist.get(u).get(i)]=1;
                            lycan++;
                        }else{
                            vampire++;
                            visited[adjlist.get(u).get(i)]=2;
                        }
                        queue.add(adjlist.get(u).get(i));
                    }
                }
            }
            return Math.max(vampire,lycan);
        }
    }

    static  int I[];
    static  int L[];
    static void LIS(int n, int arr[]){
        I = new int[n+1];
        L = new int[n];
        I[0] = Integer.MIN_VALUE;
        for(int i=1;i<=n; i++){
            I[i] = Integer.MAX_VALUE;
        }
        int lisLength = 1;

        for(int i=n-1; i>=0; i--) {
            int low = 1;
            int high = lisLength;
            int mid = 0;
            while (low < high) {
                mid = (low + high) >> 1;
                if (I[mid] <= arr[i]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            I[high] = arr[i];
            L[i] = high;
            if(lisLength<=high){
                lisLength++;
            }
        }
    }


    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String str = sc.next();
        if(str.charAt(2)==str.charAt(3) && str.charAt(4)==str.charAt(5)){
            pw.println("Yes");
        }else{
            pw.println("No");
        }
            pw.close();
    }


    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if(lenbuf <= 0)
                    return -1;
            }
            return inbuf[ptrbuf++];
        }
        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }
        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public String nextLine(){
            int b = readByte();
            StringBuilder sb = new StringBuilder();
            while(b != '\n' || b != '\r'){
                sb.appendCodePoint(b);
            }
            return sb.toString();
        }
        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public char[] next(int n){
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }
        public char nextChar () {
            return (char) skip();
        }
    }
}
 
 