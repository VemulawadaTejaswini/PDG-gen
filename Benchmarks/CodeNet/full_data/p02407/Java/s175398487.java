import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int size = Integer.parseInt(stdin.nextLine());
		List<String> output = new ArrayList<String>();
		String input = stdin.nextLine();
		String[] inputs = input.split(" ");
		int[] numbers = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			numbers[i] = Integer.parseInt(inputs[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print( numbers[numbers.length - 1 - i]);	
			System.out.print(" ");
		}
	
	}
}