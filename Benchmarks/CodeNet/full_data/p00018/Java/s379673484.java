import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i=0; i<5; i++){
			input.add(scanner.nextInt());
		}
		Collections.sort(input);
		Collections.reverse(input);
		System.out.println(input.get(0) + " " + input.get(1) + " " + input.get(2) + " " + input.get(3) + " " + input.get(4));
	}
}