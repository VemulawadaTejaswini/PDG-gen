import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int s;
	private boolean[] flag;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			
			s = Integer.parseInt(nico[1]);
			if (s > 1000) {
				System.out.println(0);
				continue;
			}
			
			flag = new boolean[10];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = false;
			}
			
			System.out.println(dfs(n, 0));
		}
	}
	
	private int dfs(int n, int sum) {
		if (sum > s) return 0;
		if (n == 0) {
			if (sum == s) return 1;
			return 0;
		}
		
		int ans = 0;
		for (int i = 0; i < flag.length; i++) {
			int num = flag.length - i - 1;
			if (flag[num] == false) {
				flag[num] = true;
				int result = dfs((n - 1), sum + n * num);
				ans = ans + result;
				flag[num] = false;
			}
		}
		
		return ans;
	}
}