
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		int[] fruit = new int[N];

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < N; i++) {
			fruit[i] = Integer.parseInt(lines[i]);
		}
		Arrays.sort(fruit);

		int sum = 0;
		for(int i = 0; i < K; i++) {
			sum = sum + fruit[i];
		}

		System.out.println(sum);
	}

}
