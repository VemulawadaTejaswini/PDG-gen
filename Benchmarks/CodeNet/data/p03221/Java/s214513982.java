import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[M];
		int Y[] = new int[M];
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			map.put(Y[i], new ArrayList(Arrays.asList(P[i], i)));
		}
		
		String ans[] = new String[M];
		int cnt[] = new int[M];
		for(ArrayList<Integer> i : map.values()) {
			ans[i.get(1)] = String.format("%06d", i.get(0)) + String.format("%06d", ++cnt[i.get(0)]);
		}
		
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
