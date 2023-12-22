import java.io.*;
import java.util.*;

public class Main {
	
	static int list[][];
	static boolean status[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(), m=in.nextInt();list=new int[n][n];
		
		for(int i=0;i<m;i++) {
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			list[s][list[s][0]+1]=t; list[s][0]++;
			list[t][list[t][0]+1]=s; list[t][0]++;
		}
		
		int q=in.nextInt();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<q;i++) {
			status=new boolean[n];
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			if(solve(n,s,t))out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static boolean solve(int n,int s, int t) {
		Queue<Integer> q=new ArrayDeque<>();
		q.add(s);
		status[s]=true;
		
		while(!q.isEmpty()) {
			int u=q.remove();
			for(int i=1;i<=list[u][0];i++) {
				int next=list[u][i];
				if(!status[next]) {
					if(next==t)return true;
					status[next]=true;
					q.add(next);
				}
			}
		}
		return false;
	}
}

