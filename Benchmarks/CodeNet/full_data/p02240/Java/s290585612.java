import java.io.*;
import java.util.*;

public class Main {
	
	static char list[][];
	static int status[];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(), m=in.nextInt();list=new char[n][n];
		
		for(int i=0;i<m;i++) {
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			list[s][t]=1; list[t][s]=1;
		}
		
		int q=in.nextInt();
		status=new int[n];
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<q;i++) {
			for(int j=0;j<n;j++)status[j]=0;
			int s=Integer.parseInt(in.next()), t=Integer.parseInt(in.next());
			if(solve(n,s,t))out.println("yes");
			else out.println("no");
		}
		out.flush();
	}
	
	static boolean solve(int n,int s, int t) {
		Queue<Integer> q=new ArrayDeque<>();
		q.add(s);
		status[s]=1;
		
		while(!q.isEmpty()) {
			int u=q.remove();
			for(int i=0;i<n;i++) {
				if(list[u][i]==1 && status[i]==0) {
					if(i==t)return true;
					status[i]=status[u]+1;
					q.add(i);
				}
			}
		}
		return false;
	}
}

