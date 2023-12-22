
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				String s = sc.next();
				HashSet<String> set = new HashSet<String>();
				for(int i=0;i<s.length();i++) {
					String s1 = s.substring(0, i), rs1 = new StringBuilder(s1).reverse().toString();
					String s2 = s.substring(i), rs2 = new StringBuilder(s2).reverse().toString();
					set.add(s1 + s2); set.add(s1 + rs2);
					set.add(s2 + s1); set.add(s2 + rs1);
					set.add(rs1 + s2); set.add(rs1 + rs2);
					set.add(rs2 + s1); set.add(rs2 + rs1);
				}
				System.out.println(set.size());
			}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}