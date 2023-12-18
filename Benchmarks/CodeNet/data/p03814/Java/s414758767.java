import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD =  1000000007L;
	public static void main(String[] args) {
		int i,j,k,l;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		for (i = 0; i < s.length; i++) {
			if(s[i]=='A')break;
		}
		int sta=i;
		for (i = s.length-1; i >= 0; i--) {
			if(s[i]=='Z')break;
		}
		int end=i;
		out.println(end-sta+1);
	}
}
