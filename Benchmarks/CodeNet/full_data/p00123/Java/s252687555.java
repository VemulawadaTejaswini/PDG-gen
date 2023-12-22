import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	String[]		rk = {
		"AAA",
		"AA",
		"A",
		"B",
		"C",
		"D",
		"E",
		"NA"
	};

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		double[]	rec = null;

		while ((rec = parseRec()) != null) {
			int	rank = get500Rank(rec[0]);

			if (rank != 7) {
				rank = Math.max(rank, get1000Rank(rec[1])); 
			}

			System.out.println(rk[rank]);
		}
	}

	private static int get500Rank(double rec) {
		int	rank = 7;

		if (rec < 35.50) {
			rank = 0;
		}
		else if (rec < 37.50) {
			rank = 1;
		}
		else if (rec < 40.00) {
			rank = 2;
		}
		else if (rec < 43.00) {
			rank = 3;
		}
		else if (rec < 50.00) {
			rank = 4;
		}
		else if (rec < 55.00) {
			rank = 5;
		}
		else if (rec < 70.00) {
			rank = 6;
		}

		return rank;
	}

	private static int get1000Rank(double rec) {
		int	rank = 7;

		if (rec < 71.00) {
			rank = 0;
		}
		else if (rec < 77.00) {
			rank = 1;
		}
		else if (rec < 83.00) {
			rank = 2;
		}
		else if (rec < 89.00) {
			rank = 3;
		}
		else if (rec < 105.00) {
			rank = 4;
		}
		else if (rec < 116.00) {
			rank = 5;
		}
		else if (rec < 148.00) {
			rank = 6;
		}

		return rank;
	}

	private static double[] parseRec() {
		double[]	rec   = null;
		String		stdin = null;

		if ((stdin = parseStdin()) != null) {
			String[]	lines = stdin.split(" ");

			rec    = new double[2]; 
			rec[0] = Double.parseDouble(lines[0]);
			rec[1] = Double.parseDouble(lines[1]);
		}

		return rec;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}