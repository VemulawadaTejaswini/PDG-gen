import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;
	static int m = 0;
	static int[] G = new int[100];

	public static void insertionSort(int[] A, int n, int g) {
		int v = 0;
		for(int i = g; i < n; i++) {
			v = A[i];
			int j = i - g;

			while(j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j + g] = v;
		}
	}

	public static void shellSort(int[] A,int n) {
		cnt = 0;

		G[0] = 1;
		m = 0;
		for(int i = 1; i < 100; i++) {
			int tmp = G[i - 1] * 3 + 1;

			if(tmp > n) {
				m = i;
				break;
			}

			G[i] = tmp;
		}

		for(int i = m - 1; i >= 0; i--) {
			insertionSort(A, n, G[i]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputNumOfTimes = Integer.parseInt(br.readLine());

		int[] sortNum = new int[inputNumOfTimes];

		for(int i = 0; i < inputNumOfTimes; i++) {
			sortNum[i] = Integer.parseInt(br.readLine());
		}

		shellSort(sortNum, inputNumOfTimes);

		System.out.println(m);

		for(int j = m - 1; j >= 0; j--) {
			System.out.print(G[j]);

			if (j == 0){
				break;
			}
			System.out.print(" ");
		}
		System.out.println();

		System.out.println(cnt);

		for(int i = 0; i < sortNum.length; i++) {
			System.out.println(sortNum[i]);
		}
	}
}