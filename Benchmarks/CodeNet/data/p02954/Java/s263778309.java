import java.io.*;
import java.util.*;

public class Main {

    

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    //
    // For each char if its R, find the first L
    // if distance b/w R and is odd increment L-1
    // else L
    static void solve() {
        String s = in.next();
        int[] data = new int[s.length()];
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                L.add(i);
            }else{
                R.add(i);
            }
        }
        out.println(L);
        out.println(R);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                int v =  getL(i,L);
                int d = v - i;
                if(d%2==0){
                    data[v]++;
                }else{
                    data[v-1]++;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                int v =  getR(i,R);
                int d = v - i;
                if(d%2==0){
                    data[v]++;
                }else{
                    data[v+1]++;
                }
            }
        }
        for(int a:data){
            out.print(a + " ");
        }
        out.println("");
    }

    static int getL(int a,ArrayList<Integer> L){
        int low = 0;
        int high =  L.size()-1;
        int mid = 0;
        int ans = 0;
        while(low<=high){
            mid = (low+high)/2;
            int v = L.get(mid);
            if(v < a){
                low = mid+1;
            }else if(v>=mid){
                high=mid-1;
                ans = mid;
            }
        }
        return L.get(ans);
    }


    static int getR(int a,ArrayList<Integer> L){
        int low = 0;
        int high =  L.size()-1;
        int mid = 0;
        int ans = 0;
        while(low<=high){
            mid = (low+high)/2;
            int v = L.get(mid);
            if(v <= a){
                low = mid+1;
                ans = mid;
            }else if(v>mid){
                high=mid-1;
            }
        }
        return L.get(ans);
    }

    static void dole() {
        String s = in.next();
        int[] data = new int[s.length() + 1];
        int j = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'R') {
                j = i + 1;
                while (j < s.length() && s.charAt(j) == 'R') {
                    j++;
                }
                for (int k = j; k > i && k < s.length(); k--) {
                    int d = j - k;
                    int h = j + 1;
                    if (d % 2 == 0) {
                        data[h]++;
                    } else {
                        data[h - 1]++;
                    }
                }
                i = j + 1;
            } else {
                i++;
            }
        }
        out.println(Arrays.toString(data));
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
