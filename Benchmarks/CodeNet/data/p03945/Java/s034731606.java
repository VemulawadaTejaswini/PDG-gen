import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int cnt=0;
		char pre  = s[0];
		for (i = 1; i < s.length; i++) {
			if(pre!=s[i]) {
				cnt++;
				pre=s[i];
			}
		}
		out.println(cnt);
	}
}
