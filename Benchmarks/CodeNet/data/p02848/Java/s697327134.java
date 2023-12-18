import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		for (i = 0; i < s.length; i++) {
			s[i] = (char)('A'+((s[i]-'A' + n)%26));
		}
		out.println(String.valueOf(s));
	}
}
