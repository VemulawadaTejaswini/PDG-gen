import java.util.Scanner;
public class Main {
	static long power(int n) {
		long ans = 1;
		for(int i = 1; i <= n; i++) {
			ans = ans * i%(int)(1e9+7);
		
		
		}
		return ans;
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		System.out.println(power(n));
		
		
		
		
		
	}

}
