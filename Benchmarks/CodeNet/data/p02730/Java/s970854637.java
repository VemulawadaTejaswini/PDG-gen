import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Boolean flag1 = false;
		Boolean flag2 = false;
		Boolean flag3 = false;
		
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		
		StringBuffer sb = new StringBuffer(S);
		StringBuffer sbr = sb.reverse();
		if(sb.toString().equals(sbr.toString())) {
			flag1 = true;
		}
		
		String parse = S.substring(0, (N -1)/2);
		sb = new StringBuffer(parse);
		sbr = sb.reverse();
		if(sb.toString().equals(sbr.toString())) {
			flag2 = true;
		}
		//System.out.println(sb + " " + sbr);
	
		parse = S.substring((N+3)/2-1, N);
		sb = new StringBuffer(parse);
		sbr = sb.reverse();
		if(sb.toString().equals(sbr.toString())) {
			flag3 = true;
		}
		//System.out.println(sb + " " + sbr);
		
		if(flag1 == true && flag2 == true && flag3 == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}