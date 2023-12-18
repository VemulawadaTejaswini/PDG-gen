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

    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int m=(n/2);
        int clone[]=arr.clone();
        Arrays.sort(clone);
        for (int i = 0; i < arr.length; i++) {
            int el=arr[i];
            int temp=el;
            int ans=clone[n-m];
            if(ans==el){
                ans=clone[n-m-1];
            }
            System.out.println(ans);
        }
    }
}




