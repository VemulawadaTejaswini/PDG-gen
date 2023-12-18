

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Integer N;
	static int[][] dp;
	static Node[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		N = Integer.parseInt(sc.next());
		Integer M = Integer.parseInt(sc.next());
		v = new Node[N];
		for(int i=0;i<N;i++) v[i] = new Node(i);
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			v[a].edges.add(b);
			v[b].edges.add(a);
		}
		dp = new int[1<<N][N];
		for(int i =0;i<(1<<N);i++) for(int j=0;j<N;j++) dp[i][j] = -1;
		int result = dp(1,0);
		out.println(result);
		out.flush();
	}

	public static int dp(int i,int j) {
		Node st=v[j];
		if(i==(1<<N)-1) return dp[i][j] = 1;
		if(dp[i][j] >= 0) return dp[i][j];
		dp[i][j]=0;
		for(int id : st.edges){
			if((i & (1<<id)) == 0) {
				dp[i][j]+= dp(i+(1<<id),id);
			}
		}
		return dp[i][j];
	}
}

class Node{
	int id;
	ArrayList<Integer> edges = new ArrayList<>();
	public Node(int id) {
		this.id = id;
	}
}
