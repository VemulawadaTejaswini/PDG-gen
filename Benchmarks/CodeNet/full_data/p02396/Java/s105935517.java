import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		
		while (input.hasNextInt()) {
			int x = input.nextInt();
			array.add(x);
		}
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) != 0) {
				System.out.println("Case " + i+1 + ": " + array.get(i));
			} else {
				
			}
		}
		input.close();
	}

}