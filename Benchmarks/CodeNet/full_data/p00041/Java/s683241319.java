import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader		br   = null;
	private	static	ArrayList<Integer>	nums = null;
	private	static	ArrayList<String>	hist = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		nums = new ArrayList<Integer>();
		hist = new ArrayList<String>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (parseNums() != -1) {
			int[]	tmps = new int[4];
			System.out.println(result(0, tmps));
			hist.clear();
		}
	}

	private static String result(int n, int tmps[]) {
		String	str = "0";
		int		len = nums.size();

		if (len == 0) {
			String curr = String.format("%d %d %d %d", tmps[0], tmps[1], tmps[2], tmps[3]);
			if (!hist.contains(curr)) {
				if ((str = calc1(tmps)).equals("0")) {
					str = calc2(tmps);
				}
				hist.add(curr);
			}
		}
		else {
			for(int i = 0; i < len && str.equals("0"); i++) {
				Integer	num = nums.get(i);
				nums.remove(i);
				tmps[n] = num;
				str = result(n + 1, tmps);
				nums.add(i, num);
			}
		}

		return str;
	}

	private static String calc1(int tmps[]) {
		String	res  = "0";
		int[]	ope  = new int[3];
		int[]	trm  = new int[2];
		boolean	loop = true;

		for (ope[0] = 0; ope[0] < 4 && loop; ope[0]++) {
			trm[0] = f(tmps[0], tmps[1], ope[0]);
			for (ope[1] = 0; ope[1] < 4 && loop; ope[1]++) {
				trm[1] = f(tmps[2], tmps[3], ope[1]);
				for (ope[2] = 0; ope[2] < 4 && loop; ope[2]++) {
					if (f(trm[0], trm[1], ope[2]) == 10) {
						res = fstr(fstr(String.valueOf(tmps[0]), String.valueOf(tmps[1]), ope[0]), fstr(String.valueOf(tmps[2]), String.valueOf(tmps[3]), ope[1]), ope[2]);
						loop = false;
					}
				}
			}
		}

		return res;
	}

	private static String calc2(int tmps[]) {
		String	res  = "0";
		int[]	ope  = new int[3];
		int[]	trm  = new int[2];
		boolean	loop = true;

		for (ope[0] = 0; ope[0] < 4 && loop; ope[0]++) {
			trm[0] = f(tmps[1], tmps[2], ope[0]);
			for (ope[1] = 0; ope[1] < 4 && loop; ope[1]++) {
				trm[1] = f(tmps[0], trm[0], ope[1]);
				for (ope[2] = 0; ope[2] < 4 && loop; ope[2]++) {
					if (f(trm[1], tmps[3], ope[2]) == 10) {
						res = fstr(fstr(String.valueOf(tmps[0]), fstr(String.valueOf(tmps[1]), String.valueOf(tmps[2]), ope[0]), ope[1]), String.valueOf(tmps[3]), ope[2]);
						loop = false;
					}
				}
			}
		}

		return res;
	}

	private static int f(int a, int b, int ope) {
		int	result = 0;

		switch (ope) {
		case 0:
			result = a + b;
			break;
		case 1:
			result = a - b;
			break;
		case 2:
			result = b - a;
			break;
		default:
			result = a * b;
			break;
		}

		return result;
	}
	
	private static String fstr(String a, String b, int ope) {
		String	result = "";

		switch (ope) {
		case 0:
			result = String.format("(%s + %s)", a, b);
			break;
		case 1:
			result = String.format("(%s - %s)", a, b);
			break;
		case 2:
			result = String.format("(%s - %s)", b, a);
			break;
		default:
			result = String.format("(%s * %s)", a, b);
			break;
		}

		return result;
	}
	
	private static int parseNums() {
		int		nStatus = -1;
		String	strIn   = null;

		nums.clear();
		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(" ");
			for (int n = 0; n < aN.length; n++) {
				nums.add(Integer.decode(aN[n]));
			}
			nStatus = 0;
		}
		
		return nStatus;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty() && !line.equals("0 0 0 0")) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}