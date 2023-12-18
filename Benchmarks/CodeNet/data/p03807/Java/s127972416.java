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
		int N = Integer.parseInt(inLines.get(0));
		String[] strArr = inLines.get(1).split(" ");
		boolean ans = true;
		for (int i = 0; i < N; i++) {
			if (Long.parseLong(strArr[i]) % 2 == 1)
				ans = !ans;
		}
		if (ans)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
