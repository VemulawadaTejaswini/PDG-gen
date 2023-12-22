import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	private static final List<String> DEG_LIST = Collections.unmodifiableList(new ArrayList<String>() {
		{
			add("N");
			add("NNE");
			add("NE");
			add("ENE");
			add("E");
			add("ESE");
			add("SE");
			add("SSE");
			add("S");
			add("SSW");
			add("SW");
			add("WSW");
			add("W");
			add("WNW");
			add("NW");
			add("NNW");
		}
	});

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		/** 風力 **/
		int dis = Integer
				.valueOf(String.valueOf(new BigDecimal(input[1]).divide(
						new BigDecimal(6), 0, RoundingMode.HALF_UP).toString()))
				.intValue();

		String disStr = null;
		if (dis <= 2) {
			disStr = "0";
		} else if (dis <= 15) {
			disStr = "1";
		} else if (dis <= 33) {
			disStr = "2";
		} else if (dis <= 54) {
			disStr = "3";
		} else if (dis <= 79) {
			disStr = "4";
		} else if (dis <= 107) {
			disStr = "5";
		} else if (dis <= 138) {
			disStr = "6";
		} else if (dis <= 171) {
			disStr = "7";
		} else if (dis <= 207) {
			disStr = "8";
		} else if (dis <= 244) {
			disStr = "9";
		} else if (dis <= 284) {
			disStr = "10";
		} else if (dis <= 326) {
			disStr = "11";
		} else {
			disStr = "12";
		}

		/** 風向 **/
		int deg = (Integer.valueOf(input[0]).intValue() * 10 + 1125) / 2250 % 16;

		String degStr = null;
		if (disStr.equals("0")) {
			degStr = "c";
		} else {
			degStr = DEG_LIST.get(deg);
		}

		System.out.println(degStr + " " + disStr);
	}
}