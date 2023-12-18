import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		int answer = 0;
		for (long i = 0; i <= N; i++) {
			int sum = 0;
			String sp[] = String.valueOf(i).split("");
			for (int j = 0; j < sp.length; j++) {
				sum += Integer.parseInt(sp[j]);
			}
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}