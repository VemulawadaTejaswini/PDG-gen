import java.util.Scanner;
import java.util.regex.Pattern;

class Main{
	public static void main(String[]$){

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		Pattern ym = Pattern.compile("^([0-9]{2}(0[1-9]|1[0-2]))$");
		Pattern my = Pattern.compile("^((0[1-9]|1[0-2])[0-9]{2})$");
		String ans = "";

		if(ym.matcher(S).find() && my.matcher(S).find())
			ans = "AMBIGUOUS";
		else if(ym.matcher(S).find())
			ans = "YYMM";
		else if(my.matcher(S).find())
			ans = "MMYY";
		else
			ans = "NA";

		System.out.println(ans);
	}
}
