import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();
		String str;

		// 1???????????\?????????????????????????????????
		while ((str = br.readLine()) != null) {
			if (str.length() == 0) {
				break;
			}
			al.add(str);
		}

		BigDecimal[][] ans = new BigDecimal[al.size()][2];

		// ??£???????¨????
		int len = al.size();
		for (int i = 0; i < len; i++) {
			String[] buf = al.get(0).split(" ");

			// ???????????????1??????????????????????????°??????????????????
			double a = Double.parseDouble(buf[0]);
			double b = Double.parseDouble(buf[1]);
			double c = Double.parseDouble(buf[2]);
			double d = Double.parseDouble(buf[3]);
			double e = Double.parseDouble(buf[4]);
			double f = Double.parseDouble(buf[5]);

			// y????±?????????????
			double y = yOperation(a, b, c, d, e, f);

			// x????±?????????????
			double x = xOperation(a, b, c, y);

			// ?°???°?????\????¬¬??????????????¨?????\
			BigDecimal bdx = new BigDecimal(x);
			bdx = bdx.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal bdy = new BigDecimal(y);
			bdy = bdy.setScale(3, BigDecimal.ROUND_HALF_UP);

			ans[i][0] = bdx;
			ans[i][1] = bdy;
		}

		// ??????
		for (int i = 0; i < ans.length; i++) {
			System.out.printf("%4.3f" + " " + "%4.3f" + "\n", ans[i][0],
					ans[i][1]);
		}
	}

	private static double yOperation(double a, double b, double c, double d,
			double e, double f) {
		double y;
		try {
			y = (f + -(d * c / a)) / ((d * -b / a) + e);
		} catch (ArithmeticException ae) {
			y = 0;
		}
		return y;
	}

	private static double xOperation(double a, double b, double c, double y) {
		double x;
		try {
			x = (c + -(b * y)) / a;
		} catch (ArithmeticException ae) {
			x=0;
		}
		return x;
	}

}