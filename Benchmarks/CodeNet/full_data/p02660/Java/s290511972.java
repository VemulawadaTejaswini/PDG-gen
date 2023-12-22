import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

        long x = n;
        long ans = 0;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (x % i == 0) {

            	long pow = 1;
            	while (x % (long)Math.pow(i, pow) == 0){
            		x /= (long)Math.pow(i, pow);
            		ans ++;
            		pow ++;
            	}

            }
        }
        if (x > 1 && x == n) {
        	ans ++;
        }
        System.out.println(ans);
	}

}