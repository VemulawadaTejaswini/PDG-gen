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
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		sc.close();
		int cnt=0;
		for(i=0;i<n;i++) {
			if(a[i]==b[i]) {
				if(b[i]!=c[i]) {
					cnt++;
				}
			} else {
				if(b[i]==c[i]) {
					cnt++;
				} else if(a[i]==c[i]) {
					cnt++;
				} else {
					cnt+=2;
				}
			}
		}
		out.println(cnt);
	}
}
