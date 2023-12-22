import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    //private static Object Node;

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




    public static void main(String[] args) {
        FastReader s = new FastReader();
        String S=s.next();
        String T=s.next();
        StringBuilder st= new StringBuilder(T);
        char cl=T.charAt(T.length()-1);
        st.substring(0,T.length()-1);
        String s1=st.toString();
        if(s1!=S || cl<='a' && cl>='z'){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }


}

