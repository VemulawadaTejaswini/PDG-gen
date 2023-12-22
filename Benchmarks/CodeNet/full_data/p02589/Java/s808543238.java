import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {

    static int N;
    static String[] A;
    static Node root = new Node();
    static long ans = 0;
    static long c1[];

    static FastIO io = new FastIO("in.txt");

    static void dfs(Node node, int ai, int i, int[] cs){
        while(true) {
            if (i <= 0) return;
            int ci = A[ai].charAt(i) - 'a';
            cs[ci]--;
            for (int nc = 0; nc < 26; nc++) {
                if (cs[nc] > 0 && node.next[ci].next[nc] != null) {
                    ans += node.next[ci].next[nc].cnt;
                }
            }

            //dfs(node.next[ci], ai, i - 1, cs);
            node = node.next[ci];
            i = i - 1;
        }
    }

    public static void main(String[] args) throws Exception {
        N = io.nextInt();
        A = new String[N];
        c1 = new long[26];
        for(int i=0; i<N; i++){
            A[i] = io.next();
            add(new StringBuilder(A[i]).reverse().toString(), root, 0);
            if(A[i].length() == 1){
                int ci = A[i].charAt(0) - 'a';
                c1[ci]++;
            }
        }

        for(int i=0; i<N; i++){
            int na = A[i].length();
            int[] cs = new int[26];
            for(int j=0; j<na; j++){
                int ci = A[i].charAt(j) - 'a';
                cs[ci]++;
            }
            for(int j=0; j<26; j++){
                if(cs[j] > 0){
                    ans += c1[j];
                }
            }
            dfs(root, i, na-1, cs);
        }

        io.println(ans - N);

        io.close();

    }

    static class Node {
        long cnt;
        Node[] next;
        public Node(){
            cnt = 0;
            next = new Node[26];
        }
    }

    static void add(String s, Node node, int i){
        int ns = s.length();
        if(i == ns){
            node.cnt++;
            return;
        }
        int ci = s.charAt(i) - 'a';
        if(node.next[ci] == null){
            node.next[ci] = new Node();
        }
        add(s, node.next[ci], i+1);
    }


    static class FastIO {
        BufferedReader br;
        StringTokenizer sk;
        PrintWriter pw = new PrintWriter(System.out);

        public FastIO(String fname){
            try{
                File f = new File(fname);
                if(f.exists()) {
                    System.setIn(new FileInputStream(fname));
                }

            }catch (Exception e){
                throw new IllegalArgumentException(e);
            }

            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastIO(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(sk==null || !sk.hasMoreElements()){
                try {
                    sk = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new IllegalArgumentException(e);
                }
            }
            return sk.nextToken();
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public char nextChar(){
            return next().charAt(0);
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }

        public void print(Object o){
            pw.print(o);
        }

        public void println(Object o){
            pw.println(o);
        }

        public void close(){
            pw.close();
        }

        public void flush(){
            pw.flush();
        }
    }
}

