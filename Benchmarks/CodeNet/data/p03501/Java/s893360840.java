import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        String st=""+n;
        char[]arr=st.toCharArray();
        long sum=0;
       for(int i=0;i<st.length();i++){
           sum+=Integer.parseInt(""+arr[i]);
       }
       if(n%sum==0){
           System.out.println("Yes");
       }
else{
           System.out.println("No");
       }
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

