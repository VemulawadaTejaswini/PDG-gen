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
		char[] s = sc.next().toCharArray();
		sc.close();
		char[] a = new char[s.length];
		int p=0;
		for (i = 0; i < s.length; i++) {
			if(s[i]=='B') {
				if(p>0) {
					p--;
				}
			} else {
				a[p]=s[i];
				p++;
			}
		}
		out.println(new String(a));
	}
}
