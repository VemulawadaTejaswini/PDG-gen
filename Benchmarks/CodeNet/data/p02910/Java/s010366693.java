import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		boolean f = true;
		for(i = 0; i < s.length; i++) {
			if(i%2==0) {
				if(s[i] == 'L') {
					f = false;
					break;
				}
			} else {
				if(s[i] == 'R') {
					f = false;
					break;
				}
			}
		}
		out.println(f?"Yes":"No");
	}
}
