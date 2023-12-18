import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int cnt = 0;
		for(int i = 1; i <= K; i++) {
			if((i + i) % K != 0) {
				continue;
			}
			if(i < K) {
				int c = (N+i)/K;
				cnt += c*c*c;
			}else {
				int c = N/K;
				cnt += c*c*c;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

}