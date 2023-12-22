import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int X = input.nextInt();
		int N = input.nextInt();
		int ans = Integer.MAX_VALUE;
		boolean[] vis = new boolean[1001];
		for (int i = 0; i < N; i++) {
			int num = input.nextInt();
			vis[num]=true;
		}
		for (int i = -1000; i <= 1000; i++) {
			if (i>=0&&!vis[i]) {
				if (Math.abs(i-X)<Math.abs(ans-X)) {
					ans=i;
				}else if (Math.abs(i-X)==Math.abs(ans-X)) ans=Math.min(i, ans);
			}else if (i<0) {
				if (Math.abs(i-X)<Math.abs(ans-X)) {
					ans=i;
				}else if (Math.abs(i-X)==Math.abs(ans-X)) ans=Math.min(i, ans);
			}
		}
		System.out.println(ans);
	}	
}
