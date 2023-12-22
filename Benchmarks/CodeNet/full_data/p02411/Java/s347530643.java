import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Objects;

public class Main{
    public static void main(String[] args){
        FastScanner sc = new FastScanner();

        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if(m==-1 && f==-1 && r==-1)break;
            if(m==-1 || f==-1)System.out.println("F");
            else if(m+f>=80)System.out.println("A");
            else if(m+f>=65)System.out.println("B");
            else if(m+f>=50)System.out.println("C");
            else if(m+f>=30){
                if(r>=50)System.out.println("C");
                else System.out.println("D");
            }
            else System.out.println("F");
        }
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
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
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

