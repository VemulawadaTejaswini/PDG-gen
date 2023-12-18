import java.util.*;

public class Main {


    public static void main(String[] args){
        long mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long nn = n;
        int[] a = new int[n];
        int k = sc.nextInt();
        long res = 0;
        for(int i=k; i<=n+1; i++) {
            long max = (nn*2+1-i) * i / 2;
            max %= mod;
            long min = (long)i * (i-1) / 2;
            min %= mod;
            res += mod + (max-min+1);
            res %= mod;
        }
        System.out.println(res);


    }



}