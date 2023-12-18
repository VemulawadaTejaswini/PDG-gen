import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k = scan.nextInt();
		
		if(n < k) {
			System.out.println(Math.min(n, k - n));
			
		}else {
			System.out.println(Math.min(n % k, k - ( n % k )));
			
		}
		
		
	}
}

