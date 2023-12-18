
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskD {
        static int log(long a  , long b){
            int ans = 0;
            while (a/b!=0){a/=b;ans++;}
            return ans;
        }
        static long pow(long a , long b){
            if (b==0)return 1;
            long v = pow(a , b/2);
            long ans = v*v;
            if (b%2!=0)ans*=a;
            return ans;
        }
        static  int[] count;
        static  boolean[] visited;
        static ArrayList<Integer>[] frinds;
        static int[] color ;
        public static void dfs(int v , int val){
            visited[v]=true;
            count[val]++;
            color[v]=val;
            if (frinds[v]!=null)for (int u: frinds[v]) {
                if (!visited[u]) dfs(u , val);
            }
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();
            long m = in.nextInt();
            long ans = n*m;
            if (n>=2 && m>=2)ans-=(2*n+2*m-4);
            else ans-=2;
            System.out.println(ans);

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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}