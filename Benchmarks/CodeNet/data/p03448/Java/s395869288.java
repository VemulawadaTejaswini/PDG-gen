import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        FastReader s = new FastReader();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();
        int ans = 0;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for(int k=0;k<=c;k++){
                    int val = i*500+j*100+k*50;
//                    System.out.println(i+" "+j+" "+k);
                    if(val == x){
//                        System.out.println("In");
                        ans++;
                    }
                }

            }
        }
        System.out.println(ans);

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
