import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String result = "No";
		if(String.valueOf(S.charAt(2)).equals(String.valueOf(S.charAt(3)))
				&&(String.valueOf(S.charAt(4)).equals(String.valueOf(S.charAt(5))))){
			result = "Yes";
		}
		System.out.println(result);
	}
}