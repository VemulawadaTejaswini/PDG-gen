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
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		int d = parseInt(sc.next());
		sc.close();
		String ans="";
		while(true) {
			c-=b;
			if(c<=0) {
				ans="Yes";
				break;
			}
			a-=d;
			if(a<=0) {
				ans="No";
				break;
			}
		}
		out.println(ans);
	}
}
