import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		sc.close();

		long C = A/B;

		long answer = 0;
		double calculatedNumber = 0;
		for(long t = 0; t <= N; t++) {
			calculatedNumber = Math.floor(t*C) - A * Math.floor(t/B);
			if(calculatedNumber >= answer) {
				answer = (long) calculatedNumber;
			}
		}
		System.out.println(answer);

	}

}
