
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			System.out.println(Ryuka(n));
		}
	}
	static long Ryuka(int n) {
		long[] ans = new long[87];
		ans[0] = 2;
		ans[1] = 1;
		for(int i = 2;i <= n;i++) {
			ans[i] = ans[i-1] + ans[i-2];
		}
		return ans[n];
	}
}

