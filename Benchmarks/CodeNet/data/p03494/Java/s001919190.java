import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            int s=0;
            while(a%2==0){
                a=a/2;
                s++;
            }
            min=Math.min(min,s);
        }
        System.out.println(min);
    }
}


class Fast {
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

