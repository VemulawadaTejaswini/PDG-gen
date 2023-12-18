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
        int n,h;
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        public void solve(int testNumber,InputReader in,PrintWriter out){
            h=0;
            n=in.nextInt();
            for(int i=0;i<n;i++){
                int a;
                a=in.nextInt();
                if(hashMap.containsKey(a)){
                    h--;
                    hashMap.remove(a);
                } else {
                    h++;
                    hashMap.put(a,false);
                }
            }
            out.println(h);
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
