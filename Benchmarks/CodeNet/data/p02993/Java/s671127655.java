import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S =sc.next().toCharArray();
		char c = S[0];
		boolean flag = true;
		for(int i =1; i < S.length; i++) {
			if (S[i] == c) {
				flag = false;
				break;
			}
			c = S[i];
		}
		if(flag) out.println("Good");
		else out.println("Bad");
		
	}
}