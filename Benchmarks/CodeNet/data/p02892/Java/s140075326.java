import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Set<Integer>> e = new HashMap<>();
		for(int i = 0; i < N; i++) {
			e.put(i+1, new HashSet<>());
			String S = sc.next();
			for(int j = 0; j < N; j++) {
				if(S.charAt(j) == '1')
					e.get(i+1).add(j+1);
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j : e.get(i)) {
				for(int k : e.get(i)) {
					if(j != k && e.get(j).contains(k)) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		int x = 0;
		for(int i = 1; i <= N; i++) {
			if(e.get(i).size() >= 3) {
				x += e.get(i).size()/2;
			}
		}
		System.out.println(N-x);
		
	}

}