import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long x = parseLong(sc.next());
		sc.close();
		long ans = 0;
		if(n%2==0) {
			ans = Math.max((n-x)*3, x*3);
		} else {
			ans = (n-1)*3;
		}
		out.println(ans);
	}
}
