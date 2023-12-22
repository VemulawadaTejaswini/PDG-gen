import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> array = new ArrayList<Integer>();

		while (true) {
			Integer n = sc.nextInt();
			if (0 == n.intValue()) {
				break;
			}
			array.add(n);
		}

		for (int i = 0; i < array.size(); i++) {
			System.out.println("Case " + (i + 1) +  ": " + array.get(i));
		}

		sc.close();
	}

}