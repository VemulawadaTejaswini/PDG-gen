import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int a = fs.nextInt();
        int b = fs.nextInt();
        int c = fs.nextInt();
        int d = fs.nextInt();
int turn = 0 ;
String ans = "";
        while (true){

            if(turn==0){

                c = c - b;

                if(c<=0){
                    ans = "Yes";
                    break;
                }

                turn =1;
            }else{

                a = a -d;

                if(a<=0){
                    ans = "No";
                    break;
                }

                turn =0;
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
