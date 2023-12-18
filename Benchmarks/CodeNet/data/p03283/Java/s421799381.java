import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int q = scanner.nextInt();
		HashMap<Integer, HashMap<Integer, Integer>> ld = new HashMap<>();
		int[][] ques = new int[q][2];

		for (int i=0; i<m; i++){
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			if (ld.containsKey(l)){
				ld.get(l).put(r, ld.get(l).getOrDefault(r, 0)+1);
			}else {
				HashMap<Integer, Integer> tmp = new HashMap<>();
				tmp.put(r, 1);
				ld.put(l, tmp);
			}
		}
		for (int i=0; i<q; i++){
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int[] que = {l, r};
			ques[i] = que;
		}
		for (int[] que: ques){
			int ans[] = {0};
			ld.forEach((beg, map)->{
				if (beg>=que[0] && beg<=que[1]){
					map.forEach((end, cnt)->{
						if (end<=que[1]) ans[0] += cnt;
					});
				}
			});
			System.out.println(ans[0]);
		}

	}
}