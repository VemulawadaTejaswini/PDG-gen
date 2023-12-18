
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		outside: for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= a; j++) {
				if (a * 1 > b * j) {
					break;
				}
				
				if (a * i == b * j) {
					System.out.println(a * i);
					break outside;
				}
			}
		}
		
		
		
	}
}
