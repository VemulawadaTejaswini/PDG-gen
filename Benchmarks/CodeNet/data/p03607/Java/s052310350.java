import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		String res = new String();
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			if (res.indexOf(line + ",") >= 0) {
				res = res.replaceAll(line + ",", "");
			} else {
				res = res + line + ",";
			}
		}
		String[] array = res.split(",");
		if (array.length == 1 && array[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(array.length);
		}

	}

}