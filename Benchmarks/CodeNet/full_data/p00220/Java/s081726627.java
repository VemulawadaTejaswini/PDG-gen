package no220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		while (Double.parseDouble(str) > 0) {
			BigDecimal bd = new BigDecimal(str);
			tobinary(bd);
			str = br.readLine();
		}
		br.close();
	}

	private static void tobinary(BigDecimal bd) {
		StringBuilder sb = new StringBuilder();
		for (int count = 8; count > -5; count--) {
			BigDecimal binary = new BigDecimal(Math.pow(2, count));
			if (isCalculable(bd, binary)) {
				sb.append("1");
				bd = bd.subtract(binary);
			} else {
				sb.append("0");
			}
			if (count == 0)
				sb.append(".");
		}
		if (bd.doubleValue() == 0) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NA");
		}
	}

	private static boolean isCalculable(BigDecimal bd, BigDecimal binary) {
		float tmp = bd.subtract(binary).floatValue();
		if (tmp >= 0)
			return true;
		return false;
	}

}