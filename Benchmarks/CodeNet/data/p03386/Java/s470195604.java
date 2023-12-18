

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int A = in.nextInt();
        int B = in.nextInt();
        int K = in.nextInt();

        int smallest[] = new int[K];
        int largest[] = new int[K];
        ArrayList<Integer> combined = new ArrayList<Integer>();


        for (int i = 0; i < K; i++) {
            smallest[i] = A + i;
        }
        for (int i = 0; i < K; i++) {
            largest[i] = B - i;
        }

        for (int i = 0; i < smallest.length; i++) {
            combined.add(smallest[i]);
        }
        for (int i = 0; i < largest.length; i++) {
            combined.add(largest[i]);
        }
        
        Set<Integer> hs = new HashSet<>();
        hs.addAll(combined);
        combined.clear();
        combined.addAll(hs);
        Collections.sort(combined);
        for (int i = 0; i < combined.size(); i++) {
            if (combined.get(i) >= A && combined.get(i) <= B) {
                System.out.println(combined.get(i));
            }
        }
    }


    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}