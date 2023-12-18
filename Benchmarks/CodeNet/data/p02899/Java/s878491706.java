import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		List<Integer> student = new ArrayList<Integer>();

		String ans = "";

		for (int i = 0; i < num; i++) {
			student.add(sc.nextInt());
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (student.get(j) == (i + 1)) {
					ans += Integer.toString(j + 1);
				}
			}
			if (i != (num - 1)) {
				ans += " ";
			}
		}

		System.out.println(ans);

	}

}
