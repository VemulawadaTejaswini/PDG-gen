import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			t = new int[n+1][n+1];
			for(int i=0;i<m;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int cost = sc.nextInt();

				t[from][to] = t[to][from] = cost;
			}

			max = 0;
			maxS = "z";
			for(int i=1;i<=n;i++){
				used = new boolean[n+1][n+1];
				solve(i,0,""+(i==10?"x":i));
			}

			System.out.println(max);
			System.out.println(maxS.replaceAll("x","10"));
		}
	}

	private static int[][] t;
	private static boolean[][] used;
	private static int max;
	private static String maxS;

	private static void solve(int from,int cost,String s){
		for(int i=1;i<t.length;i++){
			if(!used[from][i] && t[from][i] != 0){
				used[from][i] = used[i][from] = true;
				solve(i,cost+t[from][i],s+" "+(i==10?"x":i));
				used[from][i] = used[i][from] = false;
			}
		}

		if(max <= cost){

			String rs = new StringBuilder(s).reverse().toString();

			if(max < cost){
				max = cost;
				if(s.compareTo(rs) < 0) maxS = s;
				else maxS = rs;
			}
			else{
				if(maxS.compareTo(s) > 0) maxS = s;
				if(maxS.compareTo(rs) > 0) maxS = rs;
			}
		}
	}
}