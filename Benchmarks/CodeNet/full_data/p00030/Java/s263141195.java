import java.util.*;
public class Main {
	//static final int num = 10;
	//static int key;
	static int ans,n;
	/*
	static int bottomSearch(int idx, int sum) { //最後に足し合わせる数は最大でも１通りしか存在しない
		for(int r = idx; r < num; r++) {
			if(sum + r == key) return(1);
		}
		
		return(0);
	}
	*/
	//nowN->現在の足した回数  Sum->足した合計値  before->前の数
	static int dfs(int nowN, int Sum, int before) {
		int count = 0;
		if(ans > ans) return(0);
		
		if(nowN == n) {
			if(Sum == ans) return(1);
			else           return(0);
		}
		for(int r = before; r < 10; r++) {
			count += dfs(nowN + 1, Sum + r, r + 1);
		}
		return(count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		n = -1;
		ans = -1;
		while(ans != 0 && n != 0) {
			n = stdIn.nextInt();
			ans = stdIn.nextInt();
			if(n == 0 && ans == 0) break;
			
			int result = dfs(0, 0, 0);
			System.out.println(result);
			
		}
		
	}

}