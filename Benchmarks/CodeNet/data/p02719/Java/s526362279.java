
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		long N = Long.parseLong(lines[0]);
		long K = Long.parseLong(lines[1]);

		long min = N;
		long beforeMin = 0;

		while(min != beforeMin) {
			beforeMin = min;

			N = Math.abs(N - K);

			if(min > N) {
				min = N;
			}
		}
		System.out.println(min);
	}

}
