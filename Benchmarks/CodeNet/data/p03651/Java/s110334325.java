import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long gcd = -1;
        long maxValue = 0;
        for(int i = 0; i < n; ++i) {
            int num = sc.nextInt();
            maxValue = Math.max(maxValue, num);
            gcd = (gcd < 0) ? num : findGCD(gcd, num);
        }

        if(k % gcd == 0 && k <= maxValue) System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
    }

    static long findGCD(long a, long b) {
		if(a < b) return findGCD(b, a);
		if(b == 0) return a;
		return findGCD(b, a % b);
	}
}