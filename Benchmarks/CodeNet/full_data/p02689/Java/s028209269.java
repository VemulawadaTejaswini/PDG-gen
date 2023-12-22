import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 4 3
		// 1 2 3 4
		// 1 3
		// 2 3
		// 2 4
		Set<Integer> ans = new HashSet<>();
		for (int i = 0; i < n; i++) {
			ans.add(i + 1);
		}
		int[] heights = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			heights[i] = sc.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (heights[b] > a) {
				ans.remove(a);
			}
			if (heights[a] > b) {
				ans.remove(b);
			}
		}
		System.out.println(ans.size());
	}
}

 
 

 
 
 
 
