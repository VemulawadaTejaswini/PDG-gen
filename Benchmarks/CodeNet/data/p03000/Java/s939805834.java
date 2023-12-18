import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			Integer l[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				l[i] = sc.nextInt();
			}
			
			int count = 1;
			int d = 0;
			for (int i = 0; i < n; i++) {
				d = d + l[i];
				if (d > x) {
					break;
				}
				count ++;
			}
			System.out.println(count);
		}
	}
}
