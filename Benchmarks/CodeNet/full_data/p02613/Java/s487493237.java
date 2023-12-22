import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put("AC", 0);
		map.put("WA", 0);
		map.put("TLE", 0);
		map.put("RE", 0);
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			map.put(S, map.get(S) + 1);
		}
		System.out.println("AC x " + map.get("AC"));
		System.out.println("WA x " + map.get("WA"));
		System.out.println("TLE x " + map.get("TLE"));
		System.out.println("RE x " + map.get("RE"));
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}