import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = Double.parseDouble(sc.next());
		double k = Double.parseDouble(sc.next());

		double newa;
		double newb;
		double newc;

		newa = b + c;
		newb = a + c;
		newc = a+b;

		a = newa;
		b = newb;
		c = newb;

		double answer = a - b;
		if(k % 2 == 0){
			answer = -answer;
		}

		int ans = (int) answer;

		System.out.println(ans);

	}

}