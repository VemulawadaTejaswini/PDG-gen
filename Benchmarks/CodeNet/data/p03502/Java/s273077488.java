import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		char[] c = s.toCharArray();
		long n = parseLong(s);
		sc.close();
		long sum=0;
		for (i = 0; i < c.length; i++) {
			sum += c[i] - '0';;
		}
		out.println(n%sum==0?"Yes":"No");
	}
}
