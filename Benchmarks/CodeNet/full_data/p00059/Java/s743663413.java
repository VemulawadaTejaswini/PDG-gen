import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]	aRect = null;

		while((aRect = parseRect()) != null) {
			result(aRect);
		}
	}

	private static double[][] parseRect() {
		double[][]	aRect = null;
		String[]	as    = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					aRect       = new double[4][2];	
					as          = line.split(" ");
					aRect[0][0] = Double.parseDouble(as[0]);
					aRect[0][1] = Double.parseDouble(as[1]);
					aRect[1][0] = Double.parseDouble(as[2]);
					aRect[1][1] = Double.parseDouble(as[3]);
					aRect[2][0] = Double.parseDouble(as[4]);
					aRect[2][1] = Double.parseDouble(as[5]);
					aRect[3][0] = Double.parseDouble(as[6]);
					aRect[3][1] = Double.parseDouble(as[7]);
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return aRect;
	}

	private static void result(double[][] aRect) {
		boolean					bin  = false;
		Rectangle2D.Double[]	rect = new Rectangle2D.Double[2];
		double[][]				dot  = {
				{ aRect[2][0], aRect[2][1] },
				{ aRect[2][0], aRect[3][1] },
				{ aRect[3][0], aRect[3][1] },
				{ aRect[3][0], aRect[2][1] },
				{ aRect[0][0], aRect[0][1] },
				{ aRect[0][0], aRect[1][1] },
				{ aRect[1][0], aRect[1][1] },
				{ aRect[1][0], aRect[0][1] },
		};

		rect[0] = new Rectangle2D.Double();
		rect[1] = new Rectangle2D.Double();

		rect[0].setRect(aRect[0][0], aRect[0][1], aRect[1][0] - aRect[0][0], aRect[1][1] - aRect[0][1]);
		rect[1].setRect(aRect[2][0], aRect[2][1], aRect[3][0] - aRect[2][0], aRect[3][1] - aRect[2][1]);

		for (int n = 0; n < dot.length && !bin; n++) {
			switch (n / 4) {
			case 0:
				bin = (rect[0].outcode(dot[n][0], dot[n][1]) == 0);
				break;
			case 1:
				bin = (rect[1].outcode(dot[n][0], dot[n][1]) == 0);
				break;
			}
		}

		if (bin) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}