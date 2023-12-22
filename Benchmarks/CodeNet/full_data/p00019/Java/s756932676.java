import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int ans = n;
		if(n == 0) {
			ans = 1;
		} else {
		for(int i = 1; i < n; i++) {
			
			ans *= (n - i);  
			
		}
		}
		System.out.println(ans);
	}
	
}