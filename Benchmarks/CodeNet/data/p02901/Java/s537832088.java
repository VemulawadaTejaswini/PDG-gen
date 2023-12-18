import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Key{
		int price;
		int pattern;
		Key(int pr , int pa){
			price = pr;
			pattern = pa;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Key keys[] = new Key[M];
		for(int i = 0 ; i < M ; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int pat = 0;
			for(int j = 0 ; j < b ; ++j){
				int c = sc.nextInt();
				c = c - 1;
				int p = 1 << c;
				pat |= p;
			}
//			System.out.println(pat);
			keys[i] = new Key(a, pat);
		}
		int dp[] = new int[(1 << N) + 1];
		int MAX = 1000000000;
		Arrays.fill(dp, MAX);
		dp[0] = 0;
		for(Key key : keys){
			int next[] = dp.clone();
			for(int i = 0 ; i < dp.length ; ++i){
				if(dp[i] == MAX){
					continue;
				}
				int np = i | key.pattern;
				int ncost = dp[i] + key.price;
//				System.out.println(i+" "+np+" "+ncost);				
				next[np] = Math.min(dp[i] + key.price, next[np]);
			}
			dp = next;
//			System.out.println(Arrays.toString(dp));
		}
//		System.out.println(Arrays.toString(dp));
		int ri = (1 << N) -1;
		if(dp[ri] == MAX){
			System.out.println(-1);
		}else{
			System.out.println(dp[ri]);
		}
	}
}
