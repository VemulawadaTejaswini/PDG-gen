import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		String s = sc.next();
		String t = sc.next();
		sc.close();
		int cnt=0;
		for (i = 0; i < n; i++) {
			if(s.substring(i).equals(t.substring(0, n-i))) {
				cnt=n-i;
				break;
			}
		}
		out.println(n * 2 - cnt);
	}
}
