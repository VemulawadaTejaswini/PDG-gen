
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int max4 = n / 4;
		int max7 = n / 7;
		
		String ans = "No";
		for (int i = 0; i <= max4; i++) {
			for (int j = 0; j <= max7; j++) {
				if (i * 4 + j * 7 == n) {
					ans = "Yes";
					break;
				}
			}
			
		}
		System.out.println(ans);
	}
}