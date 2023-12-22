import java.util.Scanner;


public class Main {
	private	static	Scanner	stdin = null;

	static {
		stdin = new Scanner(System.in);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]		aParam = new int[2];
		double[]	aPoint = new double[2];
		int			nAngle = 0;

		while(true) {
			aParam = parseParam();
			if (aParam[0] == 0 && aParam[1] == 0) {
				break;
			}

			aPoint[0] = aPoint[0] + (double)aParam[0] * Math.sin(Math.toRadians((double)nAngle));
			aPoint[1] = aPoint[1] + (double)aParam[0] * Math.cos(Math.toRadians((double)nAngle));
			nAngle    = (nAngle + aParam[1] + 360) % 360;
		}

		System.out.printf("%d\n%d\n", (int)aPoint[0], (int)aPoint[1]);
	}

	private static int[] parseParam() {
		int[]		aCross = new int[2];
		String[]	aNum   = stdin.next().split(",");

		aCross[0] = Integer.parseInt(aNum[0]);
		aCross[1] = Integer.parseInt(aNum[1]);

		return aCross;
	}
}