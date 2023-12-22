import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		sc.close();
		n--;
		StringBuilder sb = new StringBuilder();
		while(n>=26) {
			sb.insert(0, (char)('a'+n%26));
//		out.println(sb);
			n/=26;
			n--;
		}
		sb.insert(0, (char)('a'+n));
		out.println(sb);
	}
}
