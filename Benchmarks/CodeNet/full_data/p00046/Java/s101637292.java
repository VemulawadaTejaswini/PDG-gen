import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		mt_Diff();
	}

	private static void mt_Diff() {
		ArrayList<Double> mts = new ArrayList<Double>();

		while (sc.hasNext()) {
			double h = sc.nextDouble();
/*
			if (h == 0.0) {
				break;
			}
*/
			mts.add(h);
		}

		Collections.sort(mts);

		System.out.printf("%f\n", Math.abs(mts.get(0) - mts.get(mts.size() - 1)) );

	}

}
