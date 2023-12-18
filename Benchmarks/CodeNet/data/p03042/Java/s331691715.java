import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(Integer.parseInt(S.substring(0, 2)) < 13 && Integer.parseInt(S.substring(2, 4)) < 13 && Integer.parseInt(S.substring(0, 2)) > 0 && Integer.parseInt(S.substring(2, 4)) > 0) {
			System.out.println("AMBIGUOUS");
		} else if(Integer.parseInt(S.substring(0, 2)) < 13 && (Integer.parseInt(S.substring(2, 4)) > 12 || Integer.parseInt(S.substring(2, 4)) == 0) && Integer.parseInt(S.substring(0, 2)) > 0) {
			System.out.println("MMYY");
		} else if((Integer.parseInt(S.substring(0, 2)) > 12 || Integer.parseInt(S.substring(0, 2)) == 0) && Integer.parseInt(S.substring(2, 4)) < 13 && Integer.parseInt(S.substring(2, 4)) > 0) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}
