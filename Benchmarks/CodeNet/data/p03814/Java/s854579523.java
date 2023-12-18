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
		String str = inLines.get(0);
		int posA;
		int posZ;
		for (posA = 0; str.charAt(posA) != 'A'; posA++) {
		}
		for (posZ = str.length() - 1; str.charAt(posZ) != 'Z'; posZ--) {
		}
		System.out.println((posZ - posA + 1));
	}
}
