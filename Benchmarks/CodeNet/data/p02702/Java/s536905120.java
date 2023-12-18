import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        String s = fs.next();
        BigInteger num = new BigInteger("2019");
        int ans = 0 ;
        for(int i=0 ; i<s.length()-4 ; i++){
            for(int j=i+4 ; j<s.length()+1 ; j++){
                //System.out.println(s.substring(i,j));
                BigInteger b = new BigInteger(s.substring(i,j));
                if(b.mod(num)==BigInteger.ZERO){
                    ans++;
                }
            }
        }

        out.println(ans);






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
