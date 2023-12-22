import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String[] a = string.split(" ");

		Poppin poppin = new Poppin(1000);

		for (int i = 0; i < a.length; i++) {

			if (a[i].equals("+")) {
				int p = poppin.pop();
				int q = poppin.pop();
				poppin.add(p + q);
				continue;

			}
			if (a[i].equals("-")) {

				int p = poppin.pop();
				int q = poppin.pop();
				poppin.add(q - p);
				continue;
			}
			if (a[i].equals("*")) {

				int p = poppin.pop();
				int q = poppin.pop();
				poppin.add(p * q);
				continue;
			}

			int n = Integer.parseInt(a[i]);
			poppin.add(n);

		}

		System.out.println(poppin.pop());

	}

}

class Poppin {
	int top = 0;
	int[] a;

	public Poppin(int n) {
		a = new int[n];
	}

	void add(int x) {
		top++;
		a[top] = x;

	}

	int pop() {
		int x = a[top];
		top--;
		return x;
	}
}