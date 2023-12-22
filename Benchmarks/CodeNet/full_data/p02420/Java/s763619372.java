import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		StringBuilder sb = new StringBuilder();
		while (true) {
			String line = sc.nextLine();

			if ("-".equals(line)) {
				break;
			}

			ArrayList<String> cards = new ArrayList<String>( Arrays.asList(line.split("")) );

			int shuffleCount = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < shuffleCount; i++) {

				int maisu = Integer.parseInt(sc.nextLine());


				for (int j = 0; j < maisu; j++) {

					String card = cards.remove(0);	// remove first element
					cards.add(card); // add first element

				}

			}
			sb.append(String.join("", cards));sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
