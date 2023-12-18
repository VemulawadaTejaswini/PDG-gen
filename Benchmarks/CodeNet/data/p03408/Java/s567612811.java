import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s  = new String[N];
		for (int i=0; i<N; i++) {
			s[i] = sc.next();
		}
		int M = sc.nextInt();
		String[] t  = new String[M];
		for (int i=0; i<M; i++) {
			t[i] = sc.next();
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0; i<N; i++) {
			Integer c = map.get(s[i]);
			if (c == null) c = 1;
			else c++;
			map.put(s[i], c);
		}		
		for (int i=0; i<M; i++) {
			Integer c = map.get(t[i]);
			if (c == null) c = -1;
			else c--;
			map.put(t[i], c);
		}		
		if (map.size() == 1) {
			System.out.println(0);
		}else {
			Integer[] a = new Integer[map.size()];
			map.values().toArray(a);
			Arrays.sort(a, Collections.reverseOrder());
			System.out.println(a[0]);
		}
	}
}
