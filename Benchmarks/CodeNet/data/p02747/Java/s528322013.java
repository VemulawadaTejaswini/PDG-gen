
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str =  in.next();
        char[] ch = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < ch.length-2 ; i++) {
            if("hii".equals(Character.toString(ch[i])+Character.toString(ch[i+1])+Character.toString(ch[i+2]))){
                flag = false;
                System.out.println("No");
                return;
            }

        }
        for (int i = 0; i < ch.length-1 ; i++) {
            if("hi".equals(Character.toString(ch[i])+Character.toString(ch[i+1]))){
                flag = true;
            }

        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");



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
