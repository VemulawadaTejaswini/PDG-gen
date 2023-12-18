import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Q = sc.nextInt();
		int H = sc.nextInt();
		int S = sc.nextInt();
		int D = sc.nextInt();
		int N = sc.nextInt();
		
		Q = 8*Q;
		H = 4*H;
		S = 2*S;
		
		int min = min(Q,H);
		int min1 = min(min,S);
		int min2 = min(min1,D);
		
		long sum;
		sum = N/2*min2;
		sum = sum + ((N%2==1)?(min1/2):0);
		
		System.out.println(sum);
	}
	
	public static int min(int a, int b) {
		if (a<=b)
			return a;
		else
			return b;
	}
}