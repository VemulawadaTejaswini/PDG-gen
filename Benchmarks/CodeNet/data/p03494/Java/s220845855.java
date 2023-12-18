import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		
		int count = 0;
		boolean hasOdd = false;
		while(true) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					hasOdd = true;
					break;
				}
			}
			if (hasOdd) {
				break;
			}
			for (int i = 0; i < n; i++) {
				a[i] = a[i] / 2;
			}
			count++;
		}
		System.out.println(count);
	}
}
