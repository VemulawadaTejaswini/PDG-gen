import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		sc.close();
		long cnt=0;
		if(b>=a&&n>1) {
			cnt=(b-a)*(n-2)+1;
		} else if(b==a&&n==1) {
			cnt=1;
		} 
		out.println(cnt);
	}
}
