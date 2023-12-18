import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		boolean a = false;
		out:for(int i = 0;i < c.length();i++) {
			for(int k = i+1;k < c.length();k++) {
				if(c.charAt(i)==c.charAt(k)) {
					System.out.println("No");
					a = true;
					break out;
				}
			}
		}
		if(a == false)System.out.println("Yes");
	}

}
