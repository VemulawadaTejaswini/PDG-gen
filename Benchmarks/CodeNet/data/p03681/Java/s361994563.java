import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int number = (int)(Math.pow(10, 9) + 7);
		double ans = 0;
		
		if(N == M) {
			ans = calc(M) * calc(N) * 2;
		}
		
		if(N - M == 1 || M - N == 1){
			ans = calc(N) * calc(M);
		}
		
		ans = ans % number;
		
		System.out.println((int)ans);
	}
	
	public static double calc(int X) {
		double ans = 1;
		for(double i = (double)X; i > 0; i--) {
			ans = ans * i;
		}
		return ans;
	}
}