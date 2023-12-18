import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String a;
		int count = 1;
		String flag = "No";
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		String[] as = a.split("");
		for (String i : as) {
			if (count % 2 == 0) {
				if (i.equals("L") || i.equals("U") || i.equals("D")) {
					flag = "Yes";
				} else {
					flag = "No";
					return;
				}
			}
			if (count % 2 != 0) {
				if (i.equals("R") || i.equals("U") || i.equals("D")) {
					flag = "Yes";
				} else {
					flag = "No";
					return;
				}
			}
			count++;
		}

		sc.close();

		System.out.println(flag);

	}

}