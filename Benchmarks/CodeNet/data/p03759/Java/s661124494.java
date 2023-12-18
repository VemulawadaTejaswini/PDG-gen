import java.util.*;
import java.io.*;

public class Main{
    static class Reader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public Reader(InputStream stream) {
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

    public static void main(String[] args) throws IOException{
        Reader in = new Reader(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if(b-a == c-b) System.out.println("YES");
        else System.out.println("NO");
    }
}
