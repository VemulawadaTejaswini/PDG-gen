import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int N = sc.nextInt();
		String [] s = new String[N];
		for (int i=0; i<N; i++) {
			s[i] = sc.next();
			Integer c = map.get(s[i]);
			if (c == null) c =1;
			else c++;
			map.put(s[i],c);
		}
		int M = sc.nextInt();
		String [] t = new String[M];
		for (int i=0; i<M; i++) {
			t[i] = sc.next();
			Integer c = map.get(t[i]);
			if (c == null) c =-1;
			else c--;
			map.put(t[i],c);
		}
		Object[] a = map.values().toArray();
		int res = 0;
		for (int i=0; i<a.length; i++) {
			res = Math.max(res, (Integer)a[i]);
		}
		System.out.println(res);
	}
}
