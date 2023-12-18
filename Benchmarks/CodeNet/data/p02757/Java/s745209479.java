import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
    //WRWWRWRR     wwwrrrrwwwwrrr
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int n = in.nextInt();
       int p = in.nextInt();
       char[] cs = in.next().toCharArray();
       long mut = 1;
       long tot = 0;
       Map<Long,Long> mp = new HashMap<>();
       long mod = p;
       long res = 0;
       mp.put((long)0,(long)1);
       if(p==2||p==5){
           for(int i=0;i<n;i++){
               int v = cs[i]-'0';
               if(v%p==0){
                   res+=i+1;
               }
           }
           out.println(res);
           return;
       }
       for(int i=n-1;i>=0;i--){
           int v = cs[i]-'0';
           long add = mut*v;
           add%=mod;
           tot = (tot+add)%mod;
           if(mp.containsKey(tot)){
               res+=mp.get(tot);
           }
           mp.put(tot,mp.getOrDefault(tot,(long)0)+1);
           mut*=10;
           mut%=mod;
       }
       out.println(res);
    }


    public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main solver = new Main();
//        int num = in.nextInt();
//        while(num-->0){
//            solver.solve(1, in, out);
//        }
        solver.solve(1, in, out);
        out.close();
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}