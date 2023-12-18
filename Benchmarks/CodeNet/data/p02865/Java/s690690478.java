
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			int ans = n/2 - 1;
			System.out.println(ans);
		}
		else {
			int ans = (n-1)/2;
			System.out.println(ans);
		}
	}

}
