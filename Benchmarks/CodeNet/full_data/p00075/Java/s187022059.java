import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			int num = Integer.parseInt(ss[0]);
			double w = Double.parseDouble(ss[1]);
			double h = Double.parseDouble(ss[2]);
			double BMI = w / (h * h);
			if (BMI >= 25) {
				System.out.println(num);
			}
		}
	}
	
}