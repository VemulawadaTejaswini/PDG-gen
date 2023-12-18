import java.util.*;

public class Main{
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		String S = $.next();
		int Flag = 0;
		for (int i = 0; i < S.length() - 1; i++){
			if (S.substring(i, i + 1).equals(S.substring(i + 1, i + 2))){
				Flag += 1;
				break;
			}
		}
		if (Flag == 0) System.out.println("Good");
		else System.out.println("Bad");
		/*
		3776 -> Bad
		8080 -> Good
		1333 -> Bad
		0024 -> Bad
		*/
	}
}
