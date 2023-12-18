import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			int C = Integer.parseInt(sc.next());
			
			if((A < C && C < B) || (A > C && C > B)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} // Scanner Close
	}
}