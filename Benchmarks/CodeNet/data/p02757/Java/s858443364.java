import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-i; j++) {
				double k = Double.parseDouble(s.substring(j, 1 + j + i));
				if (k % p == 0) {
                  System.out.println(k);
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
