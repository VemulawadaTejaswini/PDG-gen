
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strS = sc.nextLine();
		String strP = sc.nextLine();

		String str2S = strS + strS;

	//	System.out.println("str2S.indexOf(strP);"+str2S.indexOf(strP));

		if(str2S.indexOf(strP) != -1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}