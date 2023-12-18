import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= N; i++) {
			int sum = 0;
			String I = String.valueOf(i);
			for (int j = 0; j < I.length(); j++) {
				sum += Integer.parseInt(i.substring(j, j + 1));
			}
			if (sum >= A && sum <= B) {
				count++;
			}
		}

		System.out.println(count);
	}
}