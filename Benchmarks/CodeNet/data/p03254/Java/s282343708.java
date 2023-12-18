import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long x = parseLong(sc.next());
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(x<a[i]) {
				x=0;
				break;
			}
			x-=a[i];
			cnt++;
		}
		if(x>0)cnt--;
		out.println(cnt);
	}
}
