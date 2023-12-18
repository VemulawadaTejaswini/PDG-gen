
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 1;
		
		while (true) {
			if (n == 1 || n == 2 || n == 4) {
				System.out.println(cnt + 3);
				return;
			}
			if (n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			cnt++;
		}
	}
	
}
