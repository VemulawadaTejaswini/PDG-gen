import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		for (Scanner sc = new Scanner(System.in); sc.hasNext();) {
			int[] in = new int[6];
			for (int i = 0; i < in.length; i++) {
				in[i] = sc.nextInt();
			}
			double D = in[0] * in[4] - in[1] * in[3];
			int xx = +in[4] * in[2] - in[1] * in[5];
			int yy = +in[0] * in[5] - in[3] * in[2];
			double ansX = (xx / D);
			double ansY = (yy / D);
			if (ansX == 0) {
				ansX = 0.0 / 1.0;
			}
			if (ansY == 0) {
				ansY = +0.0 / 1.0;
			}
			System.out.println(String.format("%.3f %.3f", ansX, ansY));
		}

	}
}