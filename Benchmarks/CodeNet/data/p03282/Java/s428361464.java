import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		long k = parseLong(sc.next());
		sc.close();
		int ans = 0;
		for(i=0;i<k;i++) {
			ans = s[i]-'0';
			if(ans!=1) break;
		}
		out.println(ans);
	}
}