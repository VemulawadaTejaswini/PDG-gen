import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
//	f(n,k) = (f(n-1,k) + k) Mod n (ただし、f(1,k) = 0)
	
	static int[] dp;
	static int f(int n,int k){
		dp[1]=0;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i-1]+k)%i;
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		if(true){
			// yosefusu
			while(true){
				int n = sc.nextInt();	
				int k = sc.nextInt();	
				int m = sc.nextInt()-1;
				if(n+k+m<=0)break;
				dp=new int[n];
				Arrays.fill(dp, -1);
				int f = f(n,k);
				System.out.println(((f+m+1+n)%n+1));
			}
			return;
		}
		while(true){
			int n = sc.nextInt();	
			int k = sc.nextInt();	
			int m = sc.nextInt()-1;
			if(n+k+m<=0)break;
			List<Integer>list= new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(i);
			}
			int cur = m;
			list.remove(cur);
			cur--;

			for (int j = 0; j < n-2; j++) {
//				for (int i = 0; i < k; i++) {
//					cur = (cur+1)%list.size();
//				}
				cur = (list.size()+cur+k%list.size())%list.size();
				list.remove(cur);
				cur--;
			}
			System.out.println(list.get(0)+1);
		}

	}

}