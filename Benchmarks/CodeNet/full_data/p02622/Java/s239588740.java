
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String t = scanner.nextLine();

		String[] ss = s.split("");
		String[] tt = t.split("");

		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (!ss[i].equals(tt[i]) ) {
				ss[i] = tt[i];
				count++;
//				System.out.print(i+ " "+ss[i]+ " "+tt[i]);
			}

		}
		System.out.println(count);

	}

}
