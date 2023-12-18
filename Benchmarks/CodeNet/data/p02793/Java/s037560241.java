import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextLong();

        long lcm = arr[0];
        for(int i = 1; i < n; i++) {
        	lcm = lcm(lcm, arr[i]);
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
        	res = (res + lcm/arr[i]) % 1000000007;
        }

        System.out.println(res);
    }

    private static long gcd(long a, long b){
    	if(b == 0)
    		return a;
    	return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
    	return a / gcd(a , b) * b;
    }
}
