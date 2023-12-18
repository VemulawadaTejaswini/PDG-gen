
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 1, cnt2 = 0;
		
		while (cnt2 < 2) {
			if (n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			cnt++;
			if (n == 4) cnt2++;
		}
		
		System.out.println(cnt);
	}
	
}
