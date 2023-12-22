import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br    = null;
	private	static	int[][]			map   = null;
	private	static	int				blank = 100;
	private	static	int				depth = 0;

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
		map = new int[10][10];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	aParam = null;

		while((aParam = paramParam()) != null) {
			switch(aParam[2]) {
			case 3:
				paint(aParam[0], aParam[1]-2);
				paint(aParam[0]-2, aParam[1]);
				paint(aParam[0]+2, aParam[1]);
				paint(aParam[0], aParam[1]+2);
			case 2:
				paint(aParam[0]-1, aParam[1]-1);
				paint(aParam[0]+1, aParam[1]-1);
				paint(aParam[0]-1, aParam[1]+1);
				paint(aParam[0]+1, aParam[1]+1);
			case 1:
				paint(aParam[0], aParam[1]-1);
				paint(aParam[0]-1, aParam[1]);
				paint(aParam[0], aParam[1]);
				paint(aParam[0]+1, aParam[1]);
				paint(aParam[0], aParam[1]+1);
				break;
			}
		}

		System.out.println(blank);
		System.out.println(depth);
	}

	private static void paint(int x, int y) {
		if (0 <= x && x < 10) {
			if (0 <= y && y < 10) {
				int state = map[y][x];
				if (state++ == 0) {
					blank--;
				}
				depth = Math.max(state, depth);
				map[y][x] = state;
			}
		}
	}

	private static int[] paramParam() {
		int[]	aParam = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(",");
			aParam = new int[3];
			aParam[0] = Integer.parseInt(aN[0]);
			aParam[1] = Integer.parseInt(aN[1]);
			aParam[2] = Integer.parseInt(aN[2]);
		}
		
		return aParam;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}