import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double diff = Double.MAX_VALUE;
		Integer output = 1001;
		Integer N = new Integer(scanner.next());
		Integer T = new Integer(scanner.next());
		Integer A = new Integer(scanner.next());
		ArrayList<Double> input = new ArrayList<Double>();
		for(int i = 0; i < N ; i ++ ) {
			input.add(Double.parseDouble(scanner.next()));
			input.add(i, T-input.get(i)*0.006);

			if(diff > (A-input.get(i))) {
				diff = A-input.get(i);
				output = i;
			}
		}

		System.out.println(output);

		scanner.close();
	}
}
