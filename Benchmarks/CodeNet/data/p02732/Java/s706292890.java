import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		HashMap<Integer, Integer> b = new HashMap<>();
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			if(b.get(a[i])==null) {
				b.put(a[i], 1);
			} else {
				b.put(a[i], b.get(a[i])+1);
			}
		}
		sc.close();
		HashMap<Integer, Integer> c = new HashMap<>();
		for (Integer ii : b.keySet()) {
			c.put(ii, b.get(ii)*(b.get(ii)-1));
		}
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < n; i++) {
			long sum=0;
			for (Integer ii : c.keySet()) {
				if(a[i]==ii) {
					sum+=(b.get(ii)-1)*(b.get(ii)-2);
				} else {
					sum+=c.get(ii);
				}
			}
			pw.println(sum/2);
		}
		pw.flush();
	}
}
