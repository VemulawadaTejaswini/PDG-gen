import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int j = 0; j < n; j++) {
			list.add(Math.abs(sc.nextInt()-x));
		}

		x = list.get(0);

		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) < x) {
				x = gcd(x, list.get(i));
			}else {
				x = gcd(list.get(i), x);
			}
		}
		System.out.println(x);
	}
	static int gcd(int a, int b) {
		int tmp;

		while((tmp = a%b) != 0) {
			a = b;
			b = tmp;
		}
		return b;
	}
}