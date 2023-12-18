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
        int arr[][]=new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i <n-1; i++) {
            arr[0][i+1]=arr[0][i+1]+arr[0][i];
        }
        arr[1][0]+=arr[0][0];
        int ans=0;
        for (int i = 1; i <n; i++) {
            arr[1][i]+=Math.max(arr[0][i],arr[1][i-1]);
        }
        System.out.println(arr[1][n-1]);

    }
}




