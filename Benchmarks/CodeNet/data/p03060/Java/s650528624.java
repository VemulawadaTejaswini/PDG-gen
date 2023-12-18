import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] values = new int[count];
		int[] costs = new int[count];
		for (int i = 0; i < count; i++) {
			values[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) {
			costs[i] = sc.nextInt();
		}
		sc.close();
		int answer = 0;
		for (int i = 0; i < count; i++) {
			if (values[i] > costs[i]) {
				answer += values[i] - costs[i];
			}
		}
		System.out.println(answer);
	}
}