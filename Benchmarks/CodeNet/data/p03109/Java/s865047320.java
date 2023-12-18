
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sAry = s.split("/");
		String ans = (sAry[1].matches("0[1-4]")) ?
				"Heisei" : "TBD";
		System.out.println(ans);
	}
}
