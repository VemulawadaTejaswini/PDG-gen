import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int companion = a.length() - b.length();
		int idx = 0;
		if(companion == 0) companion = a.compareTo(b);
		if(companion > 0) System.out.println("GREATER");
		else if(companion < 0) System.out.println("LESS");
		else System.out.println("EQUAL");
	}
}
