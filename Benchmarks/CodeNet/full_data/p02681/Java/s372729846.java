import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        InputReader in=new InputReader(System.in);
        String s=in.next();
        String t=in.next();
        boolean flag=true;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=t.charAt(i))
                flag=false;
            if(flag&&t.length()-s.length()==1)
                out.println("Yes");
            else
                out.println("No");
        out.flush();
    }
    static class InputReader{
        private BufferedReader in;
        private StringTokenizer tokenizer;
        public InputReader(InputStream stream){
            in = new BufferedReader(new InputStreamReader(stream),32768);
            tokenizer = null;
        }
        public String next() throws IOException{
            while(tokenizer==null || !tokenizer.hasMoreTokens()){
                tokenizer = new StringTokenizer(in.readLine());
            }
            return tokenizer.nextToken();
        }
        public Long nextLong() throws IOException {
            String next = next();
            return Long.valueOf(next);
        }
        public int nextInt() throws IOException{
            return Integer.valueOf(next());
        }
    }
}