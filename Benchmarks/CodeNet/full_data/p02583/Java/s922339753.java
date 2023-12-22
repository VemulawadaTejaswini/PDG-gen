import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.StringTokenizer;


public class Main {

    private final static FastReader in = new FastReader();
    private static final PrintWriter out = new PrintWriter(System.out);


    public static int solve(int[] arr) {
        int ans=0;
        int min1=0,min2=0,max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int ii = i + 1; ii < arr.length; ii++) {
                for (int iii = ii + 1; iii < arr.length; iii++) {
                  if(arr[i]!=arr[ii]&&arr[ii]!=arr[iii]&&arr[i]!=arr[iii]){
                      if(arr[i]>arr[ii]&&arr[i]>arr[iii]){
                          min1=arr[ii];
                          min2=arr[iii];
                          max=arr[i];
                      }else if(arr[ii]>arr[i]&&arr[ii]>arr[iii]){
                          min1=arr[i];
                          min2=arr[iii];
                          max=arr[ii];
                      }else if(arr[iii]>arr[ii]&&arr[iii]>arr[i]){
                          min1=arr[ii];
                          min2=arr[i];
                          max=arr[iii];
                      }
                      if(max<(min1+min2)){
                          ans++;
                      }
                  }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        out.println(solve(arr));

        out.flush();
    }

    private static final class FastReader {
        private static BufferedReader BF;
        private static StringTokenizer ST;

        public FastReader() {
            BF = new BufferedReader(new InputStreamReader(System.in));
            ST = null;
        }


        public final String next() {
            while (ST == null || !ST.hasMoreTokens()) {
                try {
                    ST = new StringTokenizer(BF.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return ST.nextToken();

        }

        final int nextInt() {
            return Integer.parseInt(next());
        }

    }


}
