import java.util.Scanner;

class Main {

	static int cnt = 0;

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int row = stdIn.nextInt();
		int[] numbers = new int[row];

		for (int i = 0; i < row; i++) {
			numbers[i] = stdIn.nextInt();
		}

		shellSort(numbers, row);

		System.out.println(cnt);

		for (int k = 0; k < row; k++) {
			System.out.println(numbers[k]);
		}
	}

	static void insertionSort(int[] numbers, int row, int G) {

		int j;
		int tmp;

		/*?????\?????????*/
		for (int i = G; i < row; i++) {
			tmp = numbers[i];
			j = i - G;
			while (j >= 0 && numbers[j] > tmp) {
				numbers[j + G] = numbers[j];
				j -= G;
				cnt++;
			}
			numbers[j + G] = tmp;
		}

	}

	static void shellSort(int[] number, int row) {
		int m;
		if (row == 1) {
			m = 1;
		}else{
			m = row / 2;
		}
		while (true){
			if (m <= 100) {
				break;
			}
			m /= 2;
		}

		int[] G = new int[m];
		G[0] = m;
		for (int i = 1; i < m; i++) {
			G[i] = G[i - 1] / 2;
		}

		for (int i = 0; i < m; i++) {
			insertionSort(number, row, G[i]);
		}
		System.out.println(m);
		for (int i = 0; i < m - 1; i++) {
			System.out.print(G[i] + " ");
		}
		System.out.println(G[m - 1]);
	}
}