import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main143 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = Integer.parseInt(scanner.nextLine());

		char[] temp = scanner.nextLine().toCharArray();
		List<Character> list = new LinkedList<Character>();

		for(char value : temp) {

			list.add(value);

		}

		for(int i = 0; i < n; i++) {
			while(i < n - 1 && list.get(i) == list.get(i + 1)) {

				list.remove(i + 1);
				n--;
			}
		}
		System.out.println(list.size());
	}
}
