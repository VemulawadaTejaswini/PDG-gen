import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int n,A,B,C;
	private static int INF=1000000000;
	private static int[] L;
	private static int dfs(int i,int a,int b,int c) {
		if(i==n) {
			if(a==0 || b == 0 || c==0) return INF;
			return Math.abs(a-A)+Math.abs(b-B)+Math.abs(c-C)-30;
		}
		
		int res=dfs(i+1,a,b,c);
		res=Math.min(res, dfs(i+1,a+L[i],b,c)+10);
		res=Math.min(res, dfs(i+1,a,b+L[i],c)+10);
		res=Math.min(res, dfs(i+1,a,b,c+L[i])+10);
		
		return res;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 L= new int[n];

		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			L[i]=sc.nextInt();
			
		}
		
		System.out.println(dfs(0,0,0,0));
	}
}
