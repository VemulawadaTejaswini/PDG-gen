import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		int x = Integer.parseInt(SubStringStart(str));
		int y = Integer.parseInt(SubStringEnd(str));
		BigDecimal k = new BigDecimal(SubStringStart(str));
		BigDecimal l = new BigDecimal(SubStringEnd(str));

		int d, r;
		String f;

		d = x / y;
		r = x % y;
		f=k.divide(l,8,BigDecimal.ROUND_HALF_UP).toPlainString();

		System.out.println(d + " " + r + " " + f);
	}

	//?¬¬????????°???????????????????????????
	public static String SubStringStart(String str) {
		int index = str.indexOf(" ");
		return (str.substring(0, index));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringEnd(String str) {
		int index = str.lastIndexOf(" ");
		return (str.substring(index + 1));
	}
}