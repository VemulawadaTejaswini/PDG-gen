import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();
        //InputStream inputStream = System.in;
        //Scanner in = new Scanner(inputStream);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        long mod = (int)1e9+7;
        int n = in.nextInt();
        int m = in.nextInt();
        LinkedList<Integer>[] adj = new LinkedList[n+1];
        for(int i=1;i<=n;i++)
            adj[i] = new LinkedList<>();
        while(m-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        int[] color = new int[n+1];
        int q = in.nextInt();
        while(q-->0){
            int v = in.nextInt();
            int d = in.nextInt();
            int c = in.nextInt();
            LinkedList<temp> queue = new LinkedList<>();
            boolean[] visited = new boolean[n+1];
            visited[v] = true;
            color[v] = c;
            queue.add(new temp(v,d));
            while(queue.size()!=0){
                temp source = queue.removeFirst();
                if(source.dist==0)
                    continue;
                Iterator<Integer> iterator = adj[source.ver].iterator();
                while(iterator.hasNext()){
                    int next = iterator.next();
                    if(!visited[next]){
                        visited[next] = true;
                        color[next] = c;
                        queue.add(new temp(next,source.dist-1));
                    }
                }
            }
        }
        for(int i=1;i<=n;i++)
            out.println(color[i]);
        out.close();
    }

    static class temp{
        int ver,dist;
        temp(int a,int b){
            ver = a;
            dist = b;
        }
    }


    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    throw new RuntimeException();
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
            }
            catch (IOException e) {
                throw new RuntimeException();
            }
            return str;
        }
    }
}
