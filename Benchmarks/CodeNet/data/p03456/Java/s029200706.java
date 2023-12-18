import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();

		List<String> lines1 = Arrays.asList(line1.split(" "));
		/*
				Integer a = Integer.parseInt(lines1.get(0));
				Integer b = Integer.parseInt(lines1.get(1));
		*/

		String a = lines1.get(0);
		String b = lines1.get(1);
		StringBuilder buff = new StringBuilder();
		buff.append(a);
		buff.append(b);

		Double c = Double.parseDouble(buff.toString());
		// 平方根
		double d = Math.sqrt(c);
		int e =(int)d;

		if ((d - e == 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}