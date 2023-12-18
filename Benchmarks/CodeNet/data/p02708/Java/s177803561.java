import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt(); //K個以上選ぶ
		int result = 0;
		int max = 0;
		int min = 0;

		int k = K;
		for(int i = 0; i<(N + 2 - K); i++) {
			min = k * (k-1)/ 2;
			max = (N*(N+1) - (N-k)*(N-k+1)) / 2;
			result += (max - min + 1);
			k++;
		}

		System.out.print(result);
	}

}
