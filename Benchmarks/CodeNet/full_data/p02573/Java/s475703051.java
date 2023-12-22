import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[][] pair = new int[q][2];
		int ans = 0;

		for(int i = 0; i < q; ++i) {
			pair[i][0] = sc.nextInt();
			pair[i][1] = sc.nextInt();
		}

		int[] parent = new int[n+1];
		Arrays.fill(parent,-1);

		for(int i = 0; i < q; ++i) {
			int a = pair[i][0];
			int b = pair[i][1];
			if(parent[a] != -1 && parent[b] != -1) {
				int temp = Math.min(parent[a],parent[b]);
				parent[a] = temp;
				parent[b] = temp;
			} else if(parent[a] == -1 && parent[b] == -1) {
				parent[a] = Math.min(a,b);
				parent[b] = Math.min(a,b);
			} else if(parent[a] != -1 && parent[b] == -1) {
				int temp = Math.min(a,b);
				parent[b] = Math.min(parent[a],temp);
			} else if(parent[a] == -1 && parent[b] != -1) {
				int temp = Math.min(a,b);
				parent[a] = Math.min(parent[b],temp);
			}
		}

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 1; i <= n; ++i) {
			map.put(parent[i],map.getOrDefault(parent[i],0)+1);
			ans = Math.max(ans,map.get(parent[i]));
		}

		System.out.println(ans);
	}
}