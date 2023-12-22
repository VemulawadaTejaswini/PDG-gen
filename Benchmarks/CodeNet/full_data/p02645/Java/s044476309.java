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
		int resultvw = v - w;
		int resultvwab;
      
		if (resultab <= 0) {
			resultvwab = 0;
		} else if (resultvw == 0)  {
			resultvwab = resultab;
		} else {
			resultvwab = resultab / (v - w);
		}


		String s;

		if (v <= w) {
			s = "NO";
		} else if (resultvwab <= t) {
			s = "YES";
		} else {
			s = "NO";
		}

		System.out.println(s);

	}

}
