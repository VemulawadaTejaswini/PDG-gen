import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private	static	Scanner				stdin = null;
	private	static	ArrayList<Integer>	list  = null;

	static {
		list  = new ArrayList<Integer>();
		stdin = new Scanner(System.in);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		nLine  = stdin.nextInt();
		int		nCross = stdin.nextInt();
		int[]	aCross = null;
		int[]	aIndex = new int[2];

		for(int i = 1; i <= nLine; i++) {
			list.add(i);
		}

		for(int nLoop = 1; nLoop <= nCross; nLoop++) {
			aCross    = parseCross();
			aIndex[0] = list.indexOf(aCross[0]);
			aIndex[1] = list.indexOf(aCross[1]);
			list.set(aIndex[1], aCross[0]);
			list.set(aIndex[0], aCross[1]);
		}

		for(int i = 1; i <= nLine; i++) {
			System.out.println(list.indexOf(i) + 1);
		}
	}

	private static int[] parseCross() {
		int[]		aCross = new int[2];
		String[]	aNum   = stdin.next().split(",");

		aCross[0] = Integer.parseInt(aNum[0]);
		aCross[1] = Integer.parseInt(aNum[1]);

		return aCross;
	}
}