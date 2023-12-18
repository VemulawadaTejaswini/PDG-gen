import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int cardNums[] = new int[2 * M + 1];

		for ( int i = 1; i <= M; i++ ) {
			cardNums[i] = in.nextInt();
			cardNums[i + M] = in.nextInt();
		}

		int limR = N;
		int limL = 1;
		for ( int i = 1; i <= M; i++ ) {
			int tempMax = 1;
			int tempMin = N;
			
			for ( int j = i; j <= i + M; j++ ) {

				if ( tempMin > cardNums[j] ) {
					tempMin = cardNums[j];
				}
				if ( cardNums[j] > tempMax ) {
					tempMax = cardNums[j];
				}
			}
			
			if ( tempMax < limR ) {
				limR = tempMax;
			}
			if ( tempMin > limL ) {
				limL = tempMin;
			}			
		}

		System.out.println(limR - limL + 1);
		in.close();
	}
}
