import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = fs.nextInt();
        if(k<10){
            out.println(k);
        }else {
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i <= 9; i++) {
                if (i == 0) {
                    ArrayList<Integer> lis = new ArrayList<>();
                    lis.add(i);
                    lis.add(i + 1);
                    map.put(i, lis);
                } else if (i == 9) {
                    ArrayList<Integer> lis = new ArrayList<>();
                    lis.add(i - 1);
                    lis.add(i);
                    map.put(i, lis);
                } else {
                    ArrayList<Integer> lis = new ArrayList<>();
                    lis.add(i - 1);
                    lis.add(i);
                    lis.add(i + 1);
                    map.put(i, lis);
                }
            }

            ArrayList<Long> lunlun = new ArrayList<>();
            lunlun.add(0, 0L);
            for (long i = 1; i <= 9; i++) {
                lunlun.add(i);
            }

            int end = 9;

            for (int i = 1; i <= end; i++) {

                long val = lunlun.get(i);
                int endDig = (int) (val % 10);
                ArrayList<Integer> options = map.get(endDig);

                for (int j = 0; j < options.size(); j++) {

                    lunlun.add(val * 10 + options.get(j));
                    if (lunlun.size() == k + 1) {
                        break;
                    }
                }
                if (lunlun.size() == k + 1) {
                    break;
                }

                if (i == end) {
                    end = lunlun.size() - 1;
                }

            }


            out.println(lunlun.get(k));
        }


        out.close();

    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
    //--------------------------------------------------------
}
