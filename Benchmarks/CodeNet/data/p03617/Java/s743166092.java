import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long Q = sc.nextInt();
		long H = sc.nextInt();
		long S = sc.nextInt();
		long D = sc.nextInt();
		long N = sc.nextInt();
		
		Q = 8*Q;
		H = 4*H;
		S = 2*S;
		
		long min = min(Q,H);
		long min1 = min(min,S);
		long min2 = min(min1,D);
		
		long sum;
		sum = N/2*min2;
		sum = sum + ((N%2==1)?(min1/2):0);
		
		System.out.println(sum);
	}
	
	public static long min(long a, long b) {
		if (a<=b)
			return a;
		else
			return b;
	}
}