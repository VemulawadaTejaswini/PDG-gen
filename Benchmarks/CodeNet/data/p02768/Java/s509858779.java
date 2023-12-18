import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
	public static int[][][][] memo;
 
	public static void main(String[] args) {
 
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
//		System.out.println(solve(n,a,b));
		BigDecimal d = pow(2, n);

		d = d.add(BigDecimal.valueOf(-1));
		d = d.add(BigDecimal.valueOf(comb(n, a) * -1));
		d = d.add(BigDecimal.valueOf(comb(n, b) * -1));
		BigDecimal x = BigDecimal.valueOf(Math.pow(10, 9) + 7);
		System.out.println(d);
		System.out.println(x);
		System.out.println((d.remainder(x)));
	}
 

    public static long comb(int n, int r){
        long num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
 
	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

	public static final BigDecimal pow(long x, long n) {
	    BigDecimal sum = BigDecimal.valueOf(1);
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum.multiply(BigDecimal.valueOf(x));
	        }
	        x *= x;
	        n >>= 1;
	    }
	    return sum;
	}

	public static long solve(int n, int a, int b) {

		int x = n - 1;
		boolean isOdd = x % 2 == 1;
		int y = x / 2;

		long answer = 0;
		for(int i=1;i<=y;i++) {
			answer += comb(n,i);
		}
		answer *= 2;

		answer += 1;
		if (isOdd) {
			answer += comb(n, y+1);
		}

		answer -= comb(n, a);
		answer -= comb(n, b);

		return answer;
	}

}