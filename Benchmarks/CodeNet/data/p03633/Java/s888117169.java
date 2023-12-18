import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			 final int N = s.nextInt();
			 ArrayList<Integer> list = new ArrayList<Integer>();
			 int ans = 0;
			 
			 for (int i = 0; i < N; i++) {
				 list.add(s.nextInt());
			 }
			 
			 ans = lcm(list);
			 
		     System.out.println(ans);
		}
	}

	private static int lcm(ArrayList<Integer> list) {
		if (list.size() < 1)
			return 1;
		int a = list.get(0);
		list.remove(0);
		return lcm(a, lcm(list));
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
