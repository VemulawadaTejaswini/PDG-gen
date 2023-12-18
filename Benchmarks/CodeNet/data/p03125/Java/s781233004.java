import java.util.Scanner;

public class Main{
	
	public static void main (String[] args) {
		
		Main main = new Main();
		
		main.solve();
	}
	
	private void solve () {
		
		Scanner scanner = new Scanner (System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (B%A==0) {
			System.out.println(A+B);
		} else {
			System.out.println(B-A);
		}
	}
}
