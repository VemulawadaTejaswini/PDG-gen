import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len, result = 0;
		if(s.length() % 2 != 0) len = s.length() - 1;
		else len = s.length() - 2;
		for(int i = len; i > 1; i -= 2) {
			if(s.substring(0, i / 2).equals(s.substring(i / 2 , i))) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}