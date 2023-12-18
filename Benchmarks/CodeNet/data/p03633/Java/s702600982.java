import java.util.Scanner;
public class Main {
	//最小公倍数lcm
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return c/b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //時計の数
		long[] t = new long[n];
		for(int i = 0; i < n; i++) {
			t[i] = stdIn.nextLong();
		}
		long max = 0;
		
		//時計が1台の時
		if(n==1) {
			System.out.println(t[0]);
			System.exit(0);
		}
		for(int i = 0; i < n-1; i++) {
			max = Math.max(lcm(t[i],t[i+1]), max);
		}
		System.out.println(max);
		
	}

}
