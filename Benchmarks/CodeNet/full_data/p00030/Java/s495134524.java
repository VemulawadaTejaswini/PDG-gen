import java.util.*;
public class Main {
	int n, ans;

	int dfs(int pos, int sum, int before) {
		int ret = 0;
		if(pos < 0 || before > 9 || sum > ans) return(0);
		if(pos == 0 && sum == ans) return(1);
		
		for(int r =before; r< 10; r++) {
			ret += dfs(pos - 1, sum + r, r + 1);
		}

		return(ret);
	}

	void doIt()  {
		Scanner stdIn = new Scanner(System.in);

		while(true) {
			n = stdIn.nextInt();
			ans =stdIn.nextInt();
			if(n + ans == 0) break;

			System.out.println(dfs(n, 0, 0));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}