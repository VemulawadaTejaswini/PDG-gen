import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m == 1) {
			System.out.println(n/2 + " " + (n/2+1));
			return;
		}
		List<Ab> list = new ArrayList<>();
		if (n % 2 == 1) {
			for (int i = 1; i <= (n-1)/2; i++) {
				list.add(new Ab(i, n-i));
			}
		} else {
			for (int i = 1; i <= n/2-1; i++) {
				list.add(new Ab(i, n-i));
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println(list.get(i).getA()+ " " + list.get(i).getB());
		}

	}

	private static class Ab{
		private int a;
		private int b;

		public Ab(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

}
