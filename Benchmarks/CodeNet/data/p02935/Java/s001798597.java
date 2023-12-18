import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] v = new int[n];
		for(i=0;i<n;i++) {
			v[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(v);
		double ans = (double)v[0];
		for(i=1;i<n;i++) {
			ans = (ans + (double)v[i])/2.0;
		}
		out.println(ans);
	}
}
