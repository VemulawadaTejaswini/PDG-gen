import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s1 = sc.next().toUpperCase();
		String s2 = sc.next().toUpperCase();
		String s3 = sc.next().toUpperCase();
		sc.close();
		out.printf("%c%c%c%n", s1.charAt(0), s2.charAt(0), s3.charAt(0));
	}
}
