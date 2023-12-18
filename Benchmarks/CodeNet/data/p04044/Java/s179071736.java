import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int l = parseInt(sc.next());
		String[] s = new String[n];
		for (i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		Arrays.parallelSort(s);
		StringBuilder sb = new StringBuilder(s[0]);
		for (i = 1; i < n; i++) {
			sb.append(s[i]);
		}
		out.println(sb.toString());
	}
}
