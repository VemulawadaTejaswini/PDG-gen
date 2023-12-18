import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int p[] = new int[n];
			
			for (int i=0; i<n; i++) {
				p[i] = sc.nextInt();
			}

			Integer count[] = {0, 0, 0};

			for (int i=0; i<n; i++) {
				if (p[i] <= a) {
					count[0]++;
				} else if (a < p[i] && p[i] <= b) {
					count[1]++;
				} else if (b < p[i]) {
					count[2]++;
				}
			}
			
			Arrays.sort(count);
			
			System.out.println(count[0]);

		}
	}
}