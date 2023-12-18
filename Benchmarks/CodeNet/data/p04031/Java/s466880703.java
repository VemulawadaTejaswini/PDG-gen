import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		int[] line = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			line[i] = scanner.nextInt();
			sum += line[i];
		}

		int y = (int)Math.round((double)sum/N);

		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += (line[i] - y)*(line[i] - y);
		}

		System.out.println(ans);

		scanner.close();
	}

}
