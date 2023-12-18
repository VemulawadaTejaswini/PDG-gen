import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		String Ts = T.substring(0,S.length());
		String result = "";
		if(S.equals(Ts)) {
			result = "Yes";
		}else {
			result = "No";
		}
		System.out.println(result);
	}

}