import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		ArrayList<Integer> a = new ArrayList<>();
		for(i=0;i<n;i++) {
			a.add(parseInt(sc.next()));
		}
		sc.close();
		Collections.sort(a, Comparator.reverseOrder());
		int tmp=0;
		for (i = 0; i < m; i++) {
			tmp=(a.get(0)>>1);
			for (j = 1; j < n; j++) {
				if(a.get(j) <= tmp) {
					break;
				}
			}
			if(j==n) {
				a.add(tmp);
			} else {
				a.add(j, tmp);
			}
			a.remove(0);
		}
		long sum = 0;
		for (i = 0; i < n; i++) {
			sum += a.get(i);
		}
		out.println(sum);
	}
}
