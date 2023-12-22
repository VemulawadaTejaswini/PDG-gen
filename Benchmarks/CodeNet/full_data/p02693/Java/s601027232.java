import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		sc.close();

		long answer = 0;
		double calculatedNumber = 0;

		for(long t = 0; t <= B ; t++) {
			calculatedNumber = Math.floor(A*t/B) - A * Math.floor(t/B);
			if(calculatedNumber >= answer) {
				answer = (long) calculatedNumber;
			}
		}
/*
		for(long t = N; t <= N-B-1 && t >= 0; t--) {
			calculatedNumber = Math.floor(A*t/B) - A * Math.floor(t/B);
			if(calculatedNumber >= answer) {
				answer = (long) calculatedNumber;
			}
		}
*/
		System.out.println(answer);

	}

}
