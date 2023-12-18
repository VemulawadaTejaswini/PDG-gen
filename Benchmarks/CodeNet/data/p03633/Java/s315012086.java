import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] t = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = in.nextLong();
        }
        long ans = t[0];
        for(int i = 1; i < n; i++){
            ans = lcm(ans, t[i]);
        }
        System.out.println(ans);
    }

   public static long gcd(long a, long b){
       return b == 0 ? a : gcd(b, a % b);
   }

   public static long lcm(long a, long b){
       return a / gcd(a, b) * b;
   }
}