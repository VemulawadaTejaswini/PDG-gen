import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] D = new int[N+1];
		D[0] = 0;

		for (int i = 0; i < N; ++i) {
			D[i+1] = D[i] + sc.nextInt();
		}

		// X内でバウンドした回数
		int counter = 0;

		for(int coordinate : D) {
			if(X < coordinate) break;
			counter++;
		}

		System.out.println(counter);

		sc.close();
	}
}