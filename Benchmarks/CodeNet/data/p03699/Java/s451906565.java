import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt();
			map[i] = s;
		}
		
		System.out.println(dfs(map, 0, 0));
	}
	
	static int dfs(int[] map, int i, int sum) {
		if (i == map.length)
			return sum % 10 == 0 ? 0 : sum;
		
		int max = Math.max(dfs(map, i+1, 0), dfs(map, i+1, sum + map[i]));
		
		return max;
	}
	
}