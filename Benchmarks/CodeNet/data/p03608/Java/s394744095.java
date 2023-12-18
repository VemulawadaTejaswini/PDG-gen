import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
public class Main {
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task=new Task();
        task.solve(1,in,out);
        out.close();
    }
    static class Task{
        int [][] G = new int [222][222];
        int [] R = new int [210];
        int [] d = new int [210];
        int n,m,r;
        public void solve(int testNumber,InputReader in,PrintWriter out){
            n=in.nextInt();
            m=in.nextInt();
            r=in.nextInt();
            for(int i=1;i<=n;i++){
                Arrays.fill(G[i],0);
            }
            for(int i=1;i<=r;i++){
                R[i]=in.nextInt();
            }
            for(int i=0;i<m;i++){
                int a,b,c;
                a=in.nextInt();
                b=in.nextInt();
                c=in.nextInt();
                G[a][b]=G[b][a]=c;
            }
            int Min=Integer.MAX_VALUE;
            for(int i=1;i<=r;i++){
                d=dij(R[i]);
                int Sum=0;
                for(int j=1;j<=r;j++){
                    Sum+=d[R[j]];
                }
                Min=Math.min(Min,Sum);
            }
            out.println(Min);
        }
        private int [] dij(int v0){
            int [] dist = new int[222];
            boolean [] vis = new boolean[222];
            Arrays.fill(dist,Integer.MAX_VALUE);
            Arrays.fill(vis,false);
            vis[v0]=true;
            for(int i=1;i<=n;i++){
                dist[i]=G[v0][i];
            }
            for(int i=2;i<=n;i++){
                int Min=Integer.MAX_VALUE;
                int pos=0;
                for(int j=1;j<=n;j++){
                    if(dist[j]<Min&&!vis[j]){
                        Min=dist[j];
                        pos=j;
                    }
                }
                vis[pos]=true;
                for(int j=1;j<=n;j++){
                    if(!vis[j]&&dist[j]>dist[pos]+G[pos][j]){
                        dist[j]=dist[pos]+G[pos][j];
                    }
                }
            }
            return dist;
        }
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
        public long nextLong(){return Long.parseLong(next());}
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
