import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ss = line.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		double c = Integer.parseInt(ss[0]);
		double d = Integer.parseInt(ss[1]);

		System.out.println(a / b + " " + a % b + " " + c / d);
	}
}