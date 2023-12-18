import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        String s = fs.next();
        boolean hit = false;
        for(int i=0 ; i<3 ; i++){
            if(s.charAt(i)=='7'){
                System.out.println("Yes");
                hit = true;
                break;
            }
        }

        if(!hit)
        System.out.println("No");












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
