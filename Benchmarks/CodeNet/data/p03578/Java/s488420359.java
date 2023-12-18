import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) d[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] t = new int[m];
		for(int i = 0 ; i < m ; i++) {
			t[i] = sc.nextInt();
		}
		Map<Integer, Integer> mpa = new HashMap<>();
		Map<Integer, Integer> mpb = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(!mpa.containsKey(d[i])) {
				mpa.put(d[i], 0);
			} else {
				mpa.put(d[i], mpa.get(d[i]) + 1);
			}
		}
		for(int i = 0 ; i < m ; i++) {
			if(!mpb.containsKey(t[i])) {
				mpb.put(t[i], 0);
			} else {
				mpb.put(t[i], mpb.get(t[i]) + 1);
			}
		}
		for(int i = 0 ; i < m ; i++) {
			if(n < m || mpa.get(t[i]) < mpb.get(t[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
