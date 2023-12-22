import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];
		numbers[0] = scanner.intNext();
		numbers[1] = scanner.intNext();
		numbers[2] = scanner.intNext();

		Arrays.sort(numbers);
		
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
	}
}