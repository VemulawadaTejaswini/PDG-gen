
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int n = sc.nextInt();
			
			if (d == 0) {
				int count = 1;
				for (int i = 1; i < n; i++) {
					if (i % 100 != 0) {
						count++;
					}
				}
				System.out.println(count);
			} else {
				long num = 100;
				if (d == 2) {
					num *= 100;
				}
				System.out.println(num * n);
				
			}
		}
	}
}