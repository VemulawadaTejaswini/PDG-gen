import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long c = parseLong(sc.next());
		sc.close();
		long cnt=0;
		while(a%2==0&&b%2==0&&c%2==0) {
			if(a==b&&b==c) {
				cnt=-1;
				break;
			}
			long a2 = a /2;
			long b2 = b /2;
			long c2 = c /2;
			a = b2 + c2;
			b = c2 + a2;
			c = a2 + b2;
			cnt++;
		}
		out.println(cnt);
	}
}
