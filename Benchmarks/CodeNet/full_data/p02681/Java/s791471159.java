import java.io.*;
import java.util.*;
public class A {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String x  = b.substring(0,b.length()-1);
		if(x.equals(a) && a.length()+1==b.length()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
