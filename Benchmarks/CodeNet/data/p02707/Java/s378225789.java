import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
//	public static int N = 201;
	public static void main(String[] args) {
		int i,j,l;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n+1];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (i = 2; i <= n; i++) {
			a[i] = parseInt(sc.next());
			if(map.get(a[i])==null) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		PrintWriter pw = new PrintWriter(out);
		for(i = 1; i <= n; i++) {
			Integer ii = map.get(i);
			pw.println(ii==null?0:ii);
		}
		pw.flush();
	}
}
