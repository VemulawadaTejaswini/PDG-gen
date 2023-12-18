import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		s[3] = '8';
		out.println(new String(s));
	}
}
