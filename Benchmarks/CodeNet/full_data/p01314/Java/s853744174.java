import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p = (int) Math.ceil(N/2);
		
		int count = 0;
		for (int j = 1; j <= p; j++) {
			int sum = 0;
			for (int i = j; i <= p; i++) {
				sum += i;

				if (sum == N) {
					count++;
					sum = 0;
					j=i-1;
					break;
				}

				if (sum > N) {
					sum = 0;
				}
			}

		}
		System.out.println(count);
	}

}

