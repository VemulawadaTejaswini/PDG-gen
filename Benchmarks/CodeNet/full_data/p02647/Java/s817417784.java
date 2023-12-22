import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		BulbList Lights = new BulbList(N);
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			Lights.power[i] = A;
		}
		sc.close();

		for (int i = 0; i < K; i++) {
			Lights.process();
		}
		for (int i = 0; i < N; i++) {
			System.out.print(Lights.power[i] + (i != N - 1 ? " " : "\n"));
		}
	}
}

class BulbList {
	int[] power;
	int[] ilm;
	int N;

	BulbList(int N){
		this.N = N;
		power = new int[N];
		ilm = new int[N];
	}

	void process() {
		for (int i = 0; i < N; i++) {
			int max = N - 1;
			int min = 0;
			if (i + power[i] < max) {
				max = i + power[i];
			}
			if (i - power[i] > min) {
				min = i - power[i];
			}
			for (int j = min; j <= max; j++) {
				ilm[j]++;
			}
		}

		for (int i = 0; i < N; i++) {
			power[i] = ilm[i];
			ilm[i] = 0;
		}
	}
}


