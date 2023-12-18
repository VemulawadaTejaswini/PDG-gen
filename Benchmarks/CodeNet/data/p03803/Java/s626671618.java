import java.util.*;
public class a {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		// get two integers separated with half-width break
		int b = sc.nextInt();
		if (a > 12) {
			a = 0;
		}
		if (b > 12) {
			b = 0;
		}
		if (a > b) {
			System.out.println("Alice");
		}
		else {
			if (b > a) {
				System.out.println("Bob");
			}
			else {
				System.out.println("Draw");
			}
		}
		
		System.out.println();
	}
}
	