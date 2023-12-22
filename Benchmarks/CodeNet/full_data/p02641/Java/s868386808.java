import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();

        solver.call(in,out);
        out.close();
    }

    static class TaskA {
        public void call(InputReader in, PrintWriter out) {
            int x ,y ,a =0 ;
            x =in.nextInt();
            y =in.nextInt();
            int[] arr = new int[y];
            for (int i = 0; i <arr.length ; i++) {
                arr[i] =in.nextInt();
                if(arr[i]==x){
                    a++;
                }
            }
            Arrays.sort(arr);
            if(y==0 || a==0){
                out.println(x);
            }
            else{
                int j=0 ,count=0  , min =Integer.MAX_VALUE ,temp=0;
                for (int i = -1; i <=100 ; i++) {
                    if(arr[j]!=i){
                        count =Math.abs(x-i);
                        if(count<min){
                            min = count;
                            temp = i;
                        }
                    }
                    else{
                        if(j!=arr.length-1)
                            j++;
                    }

                }
                out.println(temp);
            }

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

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}