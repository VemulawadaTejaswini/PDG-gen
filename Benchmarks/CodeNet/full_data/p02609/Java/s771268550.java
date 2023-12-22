import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        int[] dp = new int[200001];
        n = Integer.valueOf(in.nextLine());
        s = in.nextLine();

        dp[0] = 0;
        for(int i=1; i<= 200000; i++){
            dp[i] = dp[i%Integer.bitCount(i)]+1;
        }

        int bits = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1') bits++;
        }

        // calculate X % ( popcount(X) +/- 1 ) 
        long x1 = 0;
        long x2 = 0;
        int b1 = 1;
        int b2 = 1;
        if(bits > 0){
            for(int i=n-1; i>=0; i--){
                if(s.charAt(i)=='1') x2 += b2 % (bits+1);
                b2 = (b2*2)%(200000);
            }
            if(bits-1>0){
                for(int i=n-1; i>=0; i--){
                    if(s.charAt(i)=='1') x1 += b1 % (bits-1);
                    b1 = (b1*2)%(200000);   
                }
            }
        }
        
        for(int i=0; i<n; i++){
            long xi = 0;
            long xbits = 0;
            if(s.charAt(i)=='1'){
                xbits = bits-1;
                if(xbits>0){
                    xi = x1 - (long) Math.round(Math.pow(2, i)) % (xbits);
                    xi = xi % xbits;
                }else{
                    print(0);
                    continue;
                }
            }else{
                xbits = bits+1;
                xi = x2 + (long) Math.round(Math.pow(2, i)) % (xbits);
                xi = xi % xbits;
            }
            print(dp[(int)xi]+1);
        }

        in.close();
    }

    private static void print(Object obj){
        System.out.println(obj);
    }
} // javac Main.java; java Main < in > out