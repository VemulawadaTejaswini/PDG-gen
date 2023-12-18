
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		int cnt = 0;
		for (long i = a; i <= b; i++) {
			if (i == 0) {
				cnt++;
				continue;
			}
			if (i % x == 0) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}
}