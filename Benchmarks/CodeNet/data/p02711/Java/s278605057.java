import java.util.*;

public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String n  = sc.next();
		
		sc.close();
		log( n.indexOf("7") > 0 ? "Yes" : "No");
	}
}	