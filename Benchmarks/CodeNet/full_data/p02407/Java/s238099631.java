import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		
		for(int i = n-1; i >= 0; i--){
			numbers[i] = scanner.nextInt();
		}

		for(int i = 0; i < n; i++){
			System.out.print(numbers[i] + " ");
		}

		System.out.print("\n");
	}
}