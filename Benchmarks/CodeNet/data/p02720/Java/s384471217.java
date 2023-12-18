import java.io.*;
import java.util.*;

public class Main {

    static boolean isLunLun(Long inp){
        long prev = inp%10;
        inp = inp/10;
        while (inp>0){
            long curr = inp%10;
            if(Math.abs(curr-prev)>=2){
                return false;
            }
            inp=inp/10;
            prev = curr;
        }
        return true;

    }

    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = fs.nextInt();
        long[] lunlun = new long[k+1];
        if(k<10){
            out.println(k);
        }else{
            lunlun[10]=10;
            long i = 11 ;
            int co = 11;
            while (co<=k){
                if(isLunLun(i)){
                    lunlun[co]=i;
                    co++;
                    i++;
                }else{
                    i = lunlun[co-1]+9;
                }
            }

            out.println(lunlun[k]);

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
