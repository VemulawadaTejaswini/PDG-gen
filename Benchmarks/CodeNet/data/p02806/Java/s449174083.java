import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}
		String x = sc.next();
		
		int sum = 0;
		boolean sleep = false;
		for (int i = 0; i < n; i++) {
			if (sleep) {
				sum += t[i];
			}
			if (s[i].equals(x)) {
				sleep = true;
			}
		}
		System.out.println(sum);
	}

}
