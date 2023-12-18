
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		List<Integer> List1 = new ArrayList<Integer>();
		List<Integer> ListN = new ArrayList<Integer>();
		boolean possible = false;
		for(int i = 0; i < M; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			if(a[i] == 1) {
				List1.add(i);
			}
			if(b[i] == N) {
				ListN.add(i);
			}
		}
		/* for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				for(int j = 0; j < M; j++) {
					if(a[j] == b[i]) {
						if(b[j] == N) {
							possible = true;
							break;
						}
					}
				}
				if(possible) {
					break;
				}
			}
		} */
		for(int i = 0; i < List1.size(); i++) {
			for(int j = 0; j < ListN.size(); j++) {
				if(b[List1.get(i)] == a[ListN.get(j)]) {
					possible = true;
					break;
				}
			}
			if(possible) {
				break;
			}
		}
		
		System.out.println(possible ? "POSSIBLE" : "IMPOSSIBLE");
		scan.close();

	}

}
