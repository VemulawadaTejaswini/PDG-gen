import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(numbers);
		

		StringBuilder sb = new StringBuilder();
		sb.append(numbers[4]);
		for (int i = 1; i < numbers.length; i++) {
			sb.insert(0, numbers[i] + " ");
		}
		System.out.println(sb.toString());
	}
}