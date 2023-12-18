import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		ArrayList<String> inLines = new ArrayList<String>();
		for (; cin.hasNext();) {
			inLines.add(cin.nextLine());
		}
		Solver solver = new Solver();
		solver.solve(inLines);
	}
}

class Solver {

	public void solve(ArrayList<String> inLines) {
		String[] strArr = inLines.get(0).split(" ");
		int A = Integer.parseInt(strArr[0]);
		int B = Integer.parseInt(strArr[1]);
		int C = Integer.parseInt(strArr[2]);
		int D = Integer.parseInt(strArr[3]);

		if (A * B > C * D)
			System.out.println((A * B));
		else
			System.out.println((C * D));
	}
}
