import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	private static List<Integer>[] graph = new ArrayList[100010];
	private static boolean[] vis = new boolean[100010];
	private static boolean[] flag = new boolean[100010];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i , n = scan.nextInt();
		for (i = 1;i <= n;i ++) {
			graph[i] = new ArrayList<>();
		}
		for (i = 0;i < n - 1;i ++) {
			int from , to;
			from = scan.nextInt();
			to = scan.nextInt();
			graph[from].add(to);
			graph[to].add(from);
		}
		flag[1] = flag[n] = true;
		dfs(1 , n);
		int cnt = 0;
		for (i = 1;i <= n;i ++) {
			if (flag[i]) {
				cnt ++;
			}
		}
		Arrays.fill(vis , false);
		int num1 = getNum(1) - 1;
		int num2 = n - num1 - cnt;
		if (num1 > num2) {
			System.out.println("Fennec");
		} else if (num1 == num2) {
			if (cnt % 2 == 1) {
				System.out.println("Fennec");
			} else {
				System.out.println("Snuke");
			}
		} else {
			System.out.println("Snuke");
		}

	}
	
	private static int getNum(int current) {
		
		vis[current] = true;
		int ans = 1;
		for (int next : graph[current]) {
			if (!flag[next] && !vis[next]) {
				ans += getNum(next);
			}
		}
		return ans;
		
	}
	
	private static boolean dfs(int current , int n) {
		
		vis[current] = true;
		if (current == n) {
			return true;
		} else {
			boolean result = false;
			for (int next : graph[current]) {
				if (!vis[next]) {
					if (dfs(next , n)) {
						flag[current] = true;
						result = true;
						break;
					}
				}
			}
			return result;
		}
		
	}
	
}






