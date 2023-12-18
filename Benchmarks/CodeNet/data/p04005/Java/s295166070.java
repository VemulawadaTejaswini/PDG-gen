import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();
		while(in.hasNextInt()) {
			input.add(in.nextInt());
		}
		in.close();
		Collections.sort(input);
		boolean b = false;
		for (int i = 0; i < 3; i++) {
			b = b || input.get(i) % 2 == 0;
		}
		long out = b ? 0 : input.get(0)*input.get(1);
		System.out.println(out);
		
	}

}