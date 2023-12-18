//Code by Sounak, IIEST
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Arrays;
public class Test1{
    public static void main(String args[])throws IOException{
        FastReader sc = new FastReader();
        StringBuilder sb = new StringBuilder();
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=a/k;
        if(a%k==0)
        t--;
        int n=k*t+k;
        //System.out.println(n);
        if(n>=a && n<=b)
        System.out.println("OK");
        else
        System.out.println("NG");
    }
    static long findMinNumber(long n) 
    { 
        long count = 0, ans = 1; 
      
        // Since 2 is only even prime,  
        // compute its power seprately. 
        while (n % 2 == 0) 
        { 
            count++; 
            n /= 2; 
        } 
      
        // If count is odd, it must be removed by dividing 
        // n by prime number. 
        if (count % 2 == 1) 
            ans *= 2; 
      
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        { 
            count = 0; 
            while (n % i == 0) 
            { 
                count++; 
                n /= i; 
            } 
      
            // If count is odd, it must be removed by 
            // dividing n by prime number. 
            if (count % 2 == 1) 
                ans *= i; 
        } 
      
        if (n > 2) 
            ans *= n; 
      
        return ans; 
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
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
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
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