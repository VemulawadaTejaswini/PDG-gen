import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int ans;
		
		int a = K - 1;
		int b = N - 1;
		
		ans = power(a, b);
		
		System.out.println(K * ans);
	}
	
	static int power(int a, int b) {
		int c = 1;
		if(1 <= b) {
			for(int i = 0; i < b; ++i) {
				c = c * a;
			}
		}
		return c;
	}
}