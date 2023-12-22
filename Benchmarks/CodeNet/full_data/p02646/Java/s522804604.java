import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		int resultab = b - a;
		int resultvw = (v - w) * t;

		String s;

		if (v <= w) {
			s = "NO";
		} else if (resultab <= resultvw) {
			s = "YES";
		} else {
			s = "NO";
		}

		System.out.println(s);

	}

}
