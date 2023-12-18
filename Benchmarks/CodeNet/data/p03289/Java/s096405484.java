import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String result = "WA";
		if("A".equals(S.substring(0,1))) {
			if(S.indexOf("C") > 1  && S.indexOf("C") < S.length()-1
					&& S.indexOf("C") == S.lastIndexOf("C")) {
				result = "AC";
			}
		}

		System.out.println(result);
	}
}
