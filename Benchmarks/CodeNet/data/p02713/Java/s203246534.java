import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long[] input = new long[3];
        for(int i = 1; i <= n; i++){
            input[0] = i;
            for(int j = 1; j <= n; j++){
                input[1] = j;
                for(int k = 1; k <= n; k++){
                    input[2] = k;
                    ans += gcd(input);
                }
            }
        }
        System.out.println(ans);
    }

    private static long gcd(long a, long b){
        while (b > 0){
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    private static long gcd(long[] input){
        long result = input[0];
        for(int i = 1; i < input.length; i++){
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input){
        long result = input[0];
        for(int i = 1; i < input.length; i++){
            result = lcm(result, input[i]);
        }
        return result;
    }

    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }


}