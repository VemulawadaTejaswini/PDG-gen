import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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


    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        Main obj = new Main();

       int h=s.nextInt();
       int n=s.nextInt();
       int[] arr=new int[n];
       int sum=0;
       for(int i=0;i<n;i++)
       {
           arr[i]=s.nextInt();
           sum+=arr[i];
       }
       if(sum>=h)
           System.out.println("Yes");
       else
           System.out.println("No");


    }






}