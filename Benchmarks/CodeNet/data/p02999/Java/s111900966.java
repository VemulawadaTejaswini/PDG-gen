import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			long k = sc.nextLong();
			long a[] = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			
			long temp = 0;
			long count = 0;
			int now = 0;
			long b = 0;
			int j = 1;
			for (int i = 0; i < n; i++) {		
				temp += a[i];
				if (temp >= k) {
					count += (n - i);
					temp -= a[now];
					b = 0;
					j = 1;
					while (temp >= k) {
						count ++;
						b += a[now + j];
						temp -= a[now + j];
						j ++;
					}
					temp += b;
					now ++;
				}
			}
			System.out.println(count);
		}
	}
}
