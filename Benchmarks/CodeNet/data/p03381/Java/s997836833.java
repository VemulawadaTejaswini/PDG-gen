import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=in.nextInt();
            }
            int[] srr = new int[n];
            for (int i = 0; i <n ; i++) {
                srr[i]=arr[i];
            }
            Arrays.sort(srr);
            HashMap<Integer , Integer> freq = new HashMap<>();
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <n; i++) {
                if (!freq.containsKey(srr[i]))freq.put(srr[i],1);
                else freq.put(srr[i],freq.get(srr[i])+1);
                map.put(srr[i],i);
            }
            int ans = (n/2)-1;
            for (int i = 0; i <n ; i++) {
               int index = map.get(arr[i])-(freq.get(arr[i])-1);
                if (index<=ans) System.out.println(srr[ans+1]);
                else System.out.println(srr[ans]);
                freq.put(arr[i],freq.get(arr[i])-1);
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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}