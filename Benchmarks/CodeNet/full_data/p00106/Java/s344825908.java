import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static			BufferedReader	br    = null;
	private	static			int				min   = 0;
	private	static	final	int[][]			table = {
		{ 1500, 2244 },	// 重みが1.50
		{ 1000, 1520 },	// 重みが1.52
		{ 1200, 1870 },	// 重みが1.56
		{  500,  850 },	// 重みが1.70
		{  300,  550 },	// 重みが1.83
		{  200,  380 },	// 重みが1.00
	};

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	sum = 0;

		while ((sum = strIn()) != 0) {
			min = 0;
			price(0, 0, sum);
			System.out.println(min);
		}
	}

	private static void price(int bit, int cost, int sum) {
		int	div  = 0;
		int	rest = 0;
		int	tmp1 = 0;

		for(int n1 = 0; n1 < table.length; n1++) {
			if ((bit & 1 << n1) != 0) {
				// ここはもう計算したからスキップ
				continue;
			}

			div = (sum / table[n1][0]);
			for (int n2 = div; n2 > 0; n2--) {
				rest = (sum % table[n1][0]) + (div - n2) * table[n1][0];
	
				if (rest == 0) {
					min = (min != 0) ? Math.min(min, cost + table[n1][1] * div) : (cost + table[n1][1] * div);
				} else {
					tmp1 = n2 * table[n1][1];
					bit += 1 << n1;
					price(bit, cost+tmp1, rest);
					bit -= 1 << n1;
				}
			}
		}
	}

	private static int strIn() {
		int		sum   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			sum = Integer.parseInt(strIn);
		}
		
		return sum;
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