
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		int ans = 0;
		if (d == 0) {
			ans = n;
		} else {
			int multi = 1;
			for (int i = 0; i < d; i++) {
				multi *= 100;
			}
			
			ans = multi * n;
		}
		
		System.out.println(ans);
	}
}