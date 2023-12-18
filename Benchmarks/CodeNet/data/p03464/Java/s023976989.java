import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
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
    static int arr[];
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int k = in.nextInt();
        long arr[]=new long[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =in.nextLong();
        }
        long min=2;
        int mi=2,ma=3;
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i+1]>ma){
                System.out.println(-1);
                return;
            }else {
                mi= (int) arr[i+1];
                ma= (int) (2*arr[i+1]-1);
            }
            if(arr[i]>=arr[i+1]){
                min=arr[i];
            }else{
                min=arr[i]*((arr[i+1]/arr[i])+1);
            }
        }
        if(arr[0]>ma){
            System.out.println(-1);
            return;
        }

        System.out.print(min+" ");
        System.out.println((arr[0]*(((ma/arr[0])+1)))-1);
    }
}




