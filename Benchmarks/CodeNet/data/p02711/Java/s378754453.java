
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		if(n % 10 == 7) {
			System.out.println("Yes");
			return;
		}
		n = n /10;
		if(n % 10 == 7) {
			System.out.println("Yes");
			return;
		}
		n = n/10;
		if(n% 10 == 7) {
			System.out.println("Yes");
			return;
		}
		
		System.out.println("No");
		

	}

}
