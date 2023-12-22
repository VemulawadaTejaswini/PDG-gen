import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(debtHell(n));
	}

	static int debtHell(int n) {
		double debt = 100000;
		for (int i = 0; i < n; i++) {
			debt *= 1.05;
			//System.out.print(debt);
			debt = Math.ceil(debt / 1000.0) * 1000;
			//System.out.println("\t" + debt);
		}
		return (int) debt;
	}
}