import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer N = new Integer(scanner.next());

		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i = 0;i<N;i++) {
			input.add(new Integer(scanner.next()));
		}

		Integer max = Collections.max(input);
		Integer min = Collections.min(input);
		String output = String.valueOf((max-min));

		System.out.println(output);

		scanner.close();
	}
}
