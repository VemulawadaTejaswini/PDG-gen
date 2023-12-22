

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int T = s.nextInt();
        Integer [] arr = new Integer[T];
        for(int i=0;i<T;i++)
            arr[i]=s.nextInt();
        Arrays.sort(arr,Collections.reverseOrder());
        long res=0;
        int t1=0;
        for(int i=0;i<T;i++){
            if(i==0){
                res+=arr[i];
                t1++;
            }
            else{
                if(t1+2<T-1){
                    res+=2*arr[i];
                    t1+=2;
                }
                else if(t1+2==T-1){
                    res+=2*arr[i];
                    break;
                }
                else if(t1+1==T-1){
                    res+=arr[i];
                    break;
                }
                else
                    break;
            }
        }
        System.out.println(res);
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


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