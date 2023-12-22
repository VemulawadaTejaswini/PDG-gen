import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double sum;
		double average;
		double b;
		double answer;

		while(true){
			int n = scanner.nextInt();
			if(n == 0){
				break;
			}

			sum = 0;
			average = 0;
			b = 0; 
			answer = 0;
			int[] numbers = new int[n];
			for(int i = 0; i < n; i++){
				numbers[i] = scanner.nextInt();
				sum += numbers[i];
			}

			average = sum / n;

			for(int i = 0; i < n; i++){
				b += (numbers[i] - average) * (numbers[i] - average);
			}

			System.out.printf("%.5f", Math.sqrt(b / n));
			System.out.print("\n");

		}
	}
}