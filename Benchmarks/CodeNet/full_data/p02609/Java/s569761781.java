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

        long x1 = 0;
        long x2 = 0;
        int[] b1 = new int[n];
        int bits1 = bits-1;
        int bits2 = bits+1;
        int[] b2 = new int[n];
        b1[0] = bits1 > 0 ? 1%(bits1) : 1;
        b2[0] = 1%(bits2);

        for(int i=1; i<n; i++){
            if(bits1>0){
                b1[i] = b1[i-1]*(2%bits1);
                b1[i] %= bits1;
            }
            b2[i] = b2[i-1]*(2%bits2);
            b2[i] %= bits2;
        }
        
        for(int i=0; i<n; i++){
            x1 += s.charAt(i)=='1' ? b1[n-i-1] : 0;
            x2 += s.charAt(i)=='1' ? b2[n-i-1] : 0;
            if(bits1>0) x1 = x1 % bits1;
            x2 = x2 % bits2;
        }

        for(int i=0; i<n; i++){
            long xi = 0;
            if(s.charAt(i)=='1'){
                // print(String.format("b = %d",b1[n-i-1]));
                if(bits1>0){
                    xi = x1 - b1[n-i-1] % (bits1);
                    if(xi < 0){
                        xi += bits1;
                    }
                    xi = xi % bits1;
                }else{
                    print(0);
                    continue;
                }
            }else{
                xi = x2 + b2[n-i-1] % (bits2);
                xi = xi % bits2;
            }
            print(dp[(int)xi]+1);
        }

        in.close();
    }

    private static void print(Object obj){
        System.out.println(obj);
    }
} // javac Main.java; java Main < in > out