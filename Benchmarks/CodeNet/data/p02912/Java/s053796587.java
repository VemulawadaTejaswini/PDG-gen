//package BeginnerContest141;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Long, Long> map = new TreeMap<>();
        long sum = 0;
        for(int i = 0; i<n; i++){
            long k = sc.nextLong();
            if(map.containsKey(k)){
                map.put(k, map.get(k)+1);
            }
            else{
                map.put(k, 1L);
            }
        }
        for(int i = 0; i<m; i++){
            long k = map.lastKey();
            if(map.get(k) == 1){
                map.remove(k);
            }
            else {
                map.put(k, map.get(k) - 1);
            }

            if(map.containsKey(k/2)){
                map.put(k/2, map.get(k/2)+1);
            }
            else{
                map.put(k/2, 1L);
            }
        }
        for(long l : map.keySet()){
            sum+=l*map.get(l);
        }
        pw.println(sum);
        //pw.println(prices);
        pw.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}