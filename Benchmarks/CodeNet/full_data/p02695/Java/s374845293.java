import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int q = scan.nextInt();
		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		for(int i = 0; i < q; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
			d[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println(dfs(a,b,c,d,new int[n],m,0,0));
	}
	
	public static int dfs(int[] a, int[] b, int[] c, int[] d, int[] num, int m, int i, int prev) {
		if(i == num.length) {
			return Ans(a,b,c,d,num);
		}
		
		int[] candidate = new int[m-prev+1];
		for(int j = 0; j < m-prev; j++) {
			num[i] = prev+j;
			candidate[j] = dfs(a,b,c,d,num,m,i+1,prev+j);
		}
		
		return max(candidate);
	}
	

	
	public static int Ans(int[] a, int[] b, int[] c, int[] d, int[] num) {
		int ans = 0;
		for(int i = 0; i < a.length; i++) {
			if(num[b[i]-1] - num[a[i]-1] == c[i]) {
				ans += d[i];
			}
		}
		return ans;
	}
	
	public static int max(int[] candidate) {
		int max = candidate[0];
		for(int i = 1; i < candidate.length; i++) {
			if(candidate[i] > max) max = candidate[i];
		}
		return max;
	}
}
