import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.abs(m - n) > 1) {
			System.out.println("1");
		}
		else {
			long factorial = 1;
			if(Math.abs(m - n) == 0) factorial *= 2;
			for(int i = 2; i <= n; i++) {
				factorial = factorial * i % 1000000007;
			}
			for(int i = 2; i <= m; i++) {
				factorial = factorial * i % 1000000007;
			}
			System.out.println(factorial);
		}
	}
}