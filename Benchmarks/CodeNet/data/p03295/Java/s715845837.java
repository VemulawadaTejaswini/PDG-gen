import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        FastReader in = new FastReader();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Task.solve(in, out);
        out.close();
    }

    static class Task {

        public static void solve(FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Node[] lend = new Node[m];
            Node[] lst = new Node[m];
            HashSet<Node> hs = new HashSet<>();
            for(int i=0;i<m;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                Node x = new Node(a,b);
                lend[i] = x;
                lst[i] = x;
                hs.add(x);
            }
            Arrays.sort(lend, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.e - o2.e;
                }
            });
            Arrays.sort(lst, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.s - o2.s;
                }
            });

            int ep = 0,sp=0,ans=0;
            while(true){
                while(ep<m){
                    if(hs.contains(lend[ep])){
                        break;
                    }
                    ep++;
                }
                if(ep>=m){
                    break;
                }
                ans++;
                while(sp<m){
                    if(lst[sp].s<lend[ep].e){
                        hs.remove(lst[sp]);
                        sp++;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(ans);
        }

        static class Node{
            int s,e;

            public Node(int s, int e) {
                this.s = s;
                this.e = e;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Node)) return false;

                Node node = (Node) o;

                if (s != node.s) return false;
                return e == node.e;

            }

            @Override
            public int hashCode() {
                int result = s;
                result = 31 * result + e;
                return result;
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
