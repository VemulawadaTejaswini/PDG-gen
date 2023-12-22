import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int datasetNum = stdin.nextInt();
		int yakusuu = 0;
		int primeNumber = 0;
		boolean judge = false;

		for(int i = 0; i < datasetNum; i++) {

			int number = stdin.nextInt();
			for(int j = 2; j <= number; j++) {
				if(j % 2 == 0 && j / 2 != 1)
					continue;
				for(int k = 2; k <= j - 1; k++) {

					if(j % k == 0) {

						judge = true;
						break;
					}
				}

				if(judge == false) {
					primeNumber++;
				}
				judge = false;
			}

			System.out.println(primeNumber);
			primeNumber = 0;

		}


	}
}