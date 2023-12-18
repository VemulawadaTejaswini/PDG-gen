import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,Integer> D = new HashMap<>();
		for(int i=0; i<n; i++) {
			int d = sc.nextInt();
			if(D.containsKey(d)) {
				D.put(d, D.get(d) + 1);
			} else {
				D.put(d, 1);
			}
		}
		int m = sc.nextInt();
		HashMap<Integer, Integer> T = new HashMap<>();
		for(int i=0; i<m; i++){
			int t = sc.nextInt();
			if(T.containsKey(t)){
				T.put(t, T.get(t) + 1);
			} else {
				T.put(t, 1);
			}
		}
		sc.close();
		for(Integer i : T.keySet()) {
			// 用意 < 必要 ならNO
			if(D.get(i) < T.get(i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
