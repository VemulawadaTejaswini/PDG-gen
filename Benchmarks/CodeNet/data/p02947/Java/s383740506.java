import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mojiSum[] = new int[100000];
		int n = Integer.parseInt(sc.next());
		char c[] = new char[10];
		for (int i = 0; i < n; i++) {
			c = sc.next().toCharArray();
			for (int j = 0; j < 10; j++) {
				mojiSum[i] += (int) c[j];
			}
		}

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (mojiSum[i] == mojiSum[j])
					ans++;
			}
		}
		System.out.println(ans);
	}
}
