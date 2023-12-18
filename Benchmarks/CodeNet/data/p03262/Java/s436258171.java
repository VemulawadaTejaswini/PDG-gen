import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] xl = new long[n];
        for(int i = 0; i < n; i++){
            xl[i] = Math.abs(sc.nextLong() - x);
        }
        System.out.println(n == 1 ? xl[0] : gcd(xl));
    }
    
    private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

    private static long gcd(long[] input){
        long result = input[0];
        for(int i = 1; i < input.length; i++)
        {
            result = gcd(result, input[i]);
        }
        return result;
    }
}
