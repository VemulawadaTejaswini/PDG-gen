
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] R = new int[in.nextInt()];
        int[] M = new int[in.nextInt()];
        int coup =  in.nextInt();

        for (int i = 0; i < R.length; i++) {
            R[i] = in.nextInt();
        }
        for (int i = 0; i < M.length; i++) {
            M[i] = in.nextInt();
        }
        int[] couparr = new int[(coup*3)];
        for (int i = 0; i < coup*3 ; i++) {
            couparr[i] = in.nextInt();
        }
         int min = Integer.MAX_VALUE;

        for (int x : R){
            for (int y : R){
                if((x+y) < min){
                    min = x+y;
                }
            }
        }
//        System.out.println(Arrays.toString(couparr));

        for (int i = 0; i < couparr.length; ) {
//            System.out.println(R[couparr[i]-1 ] +" " + couparr[i+1]);
            if((R[couparr[i]-1] + M[couparr[i+1]-1] - couparr[i+2] ) < min){
                min = R[couparr[i]-1] + M[couparr[i+1]-1] - couparr[i+2];
            }
            i = i+ 3;
//            System.out.println(min);
        }
        System.out.println(min);


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

