import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int number = 0;;
		int yakusuu = 0;
		int datasetNum = 3;
		int[] primeNumber = new int[datasetNum];
		for(int i = 0; i < datasetNum ; i++) {
			number = stdin.nextInt();
			for(int j = 1; j <= number; j++) {

				for(int k = 1; k <=j; k++ ) {

					if(j % k == 0) {
						yakusuu++;
					}
				}
				if(yakusuu == 2) {
					primeNumber[i]++;
				}
				yakusuu = 0;
			}
		}
		for(int i =0; i < datasetNum; i++) {
			System.out.println(primeNumber[i]);
		}
	}
}