import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			if (x % 2 == 0) {
				cnt++;
				if (x %3 == 0 || x % 5 == 0) {
					cnt--;
				}
			}
		}
		
		if (cnt == 0) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}
	}

}