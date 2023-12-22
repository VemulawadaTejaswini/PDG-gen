import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		String line;
		List<Integer> input = new ArrayList<>();
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			input.add(stdIn.nextInt());
		}
		Collections.sort(input);
		for(int i : input) {
			System.out.print(i + " ");
		}

	}

}