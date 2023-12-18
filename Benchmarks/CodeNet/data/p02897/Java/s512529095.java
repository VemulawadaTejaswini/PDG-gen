

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k= 1;
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("SUN",7);
        hashMap.put("MON",6);
        hashMap.put("TUE",5);
        hashMap.put("WED",4);
        hashMap.put("THU",3);
        hashMap.put("FRI",2);
        hashMap.put("SAT",1);
        String s1;
        String s2;
        int a,b;
        double n;
        while(k-->0){
            n=s.nextDouble();
            if(n%2==0)
                System.out.println((n/2)/n);
            else
                System.out.println((n+1)/(2*n));
        }
    }

    private static int binary_search(
            int arr[], int l,
            int h, int x)
    {
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] <= x)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return h;
    }
    static int gcd(int a, int b)
    {
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
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