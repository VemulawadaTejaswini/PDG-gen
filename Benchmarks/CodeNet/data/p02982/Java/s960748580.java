import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int[][] arrayTwoDimension = new int[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				arrayTwoDimension[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int count = 0;
		for(int i = 0; i < N; i++) {
			
			for(int j = i + 1; j < N; j++) {
				double squareValue = 0;
				for(int k = 0; k < D; k++) {
					double value = Math.abs(arrayTwoDimension[i][k] - arrayTwoDimension[j][k]);
					double square = value * value;
					squareValue = squareValue + square;
				}
				double judge = Math.sqrt(squareValue);
				if(judge == Math.floor(judge)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}