import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer sum = 0;

		Integer numTypeDonuts= new Integer(scanner.next());
		Integer donutsMaterials = new Integer(scanner.next());

		ArrayList<Integer> materialAmount = new ArrayList<Integer>();
		for(int i = 0; i < numTypeDonuts;i++) {
			materialAmount.add(new Integer(scanner.next()));
			sum += materialAmount.get(i);

		}
		Integer output = (donutsMaterials - sum) / Collections.min(materialAmount) + numTypeDonuts;

		System.out.println(output);

		 scanner.close();
	}

}
