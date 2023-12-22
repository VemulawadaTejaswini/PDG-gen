import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int number = 0;
		int yakusuu = 0;
		int datasetNum = 3;
		int[] primeNumber = new int[datasetNum];
		for(int i = 0; i < datasetNum ; i++) {
			number = stdin.nextInt();
			for(int j = 1; j <= number; j++) {

				for(int k = 2; k <=j - 1; k++ ) {

					if(j % k == 0) {
						break;
					}
					primeNumber[i]++;
					if(primeNumber[i]!=0) {
						break;
					}
					
				}
			}
		}
		for(int i =0; i < datasetNum; i++) {
			System.out.println(primeNumber[i]);
		}
	}
}