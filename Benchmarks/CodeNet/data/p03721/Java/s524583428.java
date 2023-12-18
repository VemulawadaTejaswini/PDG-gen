import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int n = sc.nextInt();
		Long k = sc.nextLong();
		int[] nums = new int[100001];
		Arrays.fill(nums, 0);
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			nums[a] += b;
		}
		sc.close();

		//処理
		int ans = -1;
		for(int i = 0; i < nums.length; i++){
			if(k <= nums[i]){
				ans = i;
				break;
			}else{
				k -= nums[i];
			}
		}

		//出力	
		out.println(ans);
		out.flush();
	}

	static class Pair{
		int a,b;
		public Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
}