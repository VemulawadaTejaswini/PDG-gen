
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input;
		BigDecimal[][] xy = new BigDecimal[2][2];
		int k = 0;
		double[] p = new double[6];//0a 1b 2c 3d 4e 5f
		try {
			for (int n = 0; n < 2; n++) {
				input = br.readLine();
				String[] prm = input.split(" ");
				for (int i = 0; i < p.length; i++) {
					p[i] = Double.parseDouble(prm[i]);
				}
				double y = (p[2] / p[0] - p[5] / p[3]) / (p[1] / p[0] - p[4] / p[3]);//(c/a-f/d)/(b/a-e/d)
				double x = (p[2] - p[1] * y) / p[0];
				BigDecimal Y = new BigDecimal(y);
				BigDecimal X = new BigDecimal(x);
				Y = Y.setScale(3, BigDecimal.ROUND_HALF_UP);
				X = X.setScale(3, BigDecimal.ROUND_HALF_UP);
				xy[k][0] = X;
				xy[k][1] = Y;
				k++;
			}
			for (int i = 0; i < xy.length; i++) {
				System.out.printf("%.3f", xy[i][0]);
				System.out.print(" ");
				System.out.printf("%.3f", xy[i][1]);
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}