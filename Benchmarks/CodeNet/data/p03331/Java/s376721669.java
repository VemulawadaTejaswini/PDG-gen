import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		int mn = 100000;
		for (i = 1; i < n; i++) {
			int tmp = sum(i) + sum(n - i);
			if(tmp<mn) {
				mn = tmp;
			}
		}
		out.println(mn);
	}
	public static int sum(int n) {
		int ret = 0;
		while(n>0) {
			ret+=n%10;
			n/=10;
		}
		return ret;
	}
}
