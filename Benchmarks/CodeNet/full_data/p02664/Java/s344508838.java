import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i]== '?')
				c[i] = 'D';
		}
			System.out.println(String.valueOf(c));
	}
}