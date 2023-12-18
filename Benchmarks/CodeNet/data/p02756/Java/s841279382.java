import com.sun.source.tree.ReturnTree;

import java.io.*;
import java.sql.Array;
import java.util.*;

 class Solution {

   static List<Integer> al[];
    private  static void solver(InputReader sc, PrintWriter out) {
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x==1){
                sb.reverse();
            }
            if(x==2){
                int f = sc.nextInt();
                String in =  sc.next();
                if(f==1){
                    sb.insert(0,in);
                }else{
                    sb.append(in);
                }
            }
        }
        out.println(sb);

    }
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
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
        public long nextLong(){
            return Long.parseLong(next());
        }

        public long[] readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
