import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();

		sc.close();

		long quotiment = N/K;

		long answer = 0;

		if(N%K == 0) {
			System.out.println(answer);
		}else {
			long innerQuot = N - (K * quotiment);
			long outerQuot = K * (quotiment + 1) - N;
			if(innerQuot <= outerQuot) {
				System.out.println(innerQuot);
			}else {
				System.out.println(outerQuot);
			}
		}
	}
}
