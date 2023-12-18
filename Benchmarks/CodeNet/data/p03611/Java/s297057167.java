import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int AMAX = 100000;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashMap<Integer, Integer> map = new HashMap<>();
		int a = 0;
		Integer v = null;
		for(i=0;i<n;i++) {
			a = parseInt(sc.next());
			v = map.get(a);
			if(v == null) {
				map.put(a, 1);
			} else {
				map.put(a, v + 1);
			}
		}
		sc.close();
		int[] an = new int[AMAX];
		for (i = 0; i < AMAX; i++) {
			v = map.get(i-1);
			if(v != null) {
				an[i] += v;
			}
			v = map.get(i);
			if(v != null) {
				an[i] += v;
			}
			v = map.get(i+1);
			if(v != null) {
				an[i] += v;
			}
		}
		Arrays.parallelSort(an);
		out.println(an[AMAX-1]);
	}
}
