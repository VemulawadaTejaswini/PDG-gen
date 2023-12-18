import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		solve(n);
		System.out.println("No");
	}
	
	static void solve(int n) {
		if(n - 4 == 0 || n - 7 == 0) {
			System.out.println("Yes");
			System.exit(0);
		}
		if(n-4>0) solve(n-4);
		if(n-7>0) solve(n-7);
	}
}