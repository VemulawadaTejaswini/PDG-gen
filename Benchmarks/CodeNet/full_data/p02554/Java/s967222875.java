import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        final long MOD = 1000000007L;
        long result;
        result = powCalc(10, n) - (2 * powCalc(9, n) - powCalc(8, n));
        while(result < 0){
            result = result + MOD;
        }
        System.out.println(result % MOD);
    }

    public static long powCalc(long base, long n){
        final long MOD = 1000000007L;
        long ret = 1;
        for(int i = 0; i<n; i++){
            ret = ret * base % MOD;
        }
        return ret;
    }
}