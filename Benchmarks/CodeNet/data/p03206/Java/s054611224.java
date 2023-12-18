import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Twinkle little = new Twinkle();
        little.star(1, in, out);
        out.close();


    }
static class Twinkle {
        public void star(int testNumber, InputReader in, PrintWriter out) {
            int n  = in.nextInt();
            int t = in.nextInt();
            //int k = in.nextInt();
            int array [] = new int[n+1];
            int max=0;
            int min =3235234;
            for (int i = 0; i < n; i++) {
                array[i]= in.nextInt();
                if(max<array[i])
                    max=array[i];
                if(min>array[i])
                    min=array[i];

            }
            int ans = max-min;
            if(ans/(n-t)>1)
                System.out.println(ans/(n-t));
            else
                System.out.println("0");

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
      public   String nextLine()
        {
            String str = "";
            try
            {
                str = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }
    }
}
