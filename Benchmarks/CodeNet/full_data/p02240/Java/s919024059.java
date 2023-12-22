import java.util.*;
public class Main {
	
	static int G[];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt();
		G=new int[n];
		List<List<Integer>> ls=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			ls.add(new ArrayList<>());
			G[i]=-1;
		}
		for(int i=0;i<m;i++) {
			int s=Integer.parseInt(in.next()),t=Integer.parseInt(in.next());
			ls.get(s).add(t);
			ls.get(t).add(s);
		}
		
		for(int i=0;i<n;i++) {
			if(G[i]==-1)solve(ls,i);
		}
// 		for(int i=0;i<n;i++)System.out.print(G[i]+" ");
		int q=in.nextInt();
		for(int i=0;i<q;i++) {
			int s=Integer.parseInt(in.next()),t=Integer.parseInt(in.next());
			if(G[s]==G[t])System.out.println("yes");
			else System.out.println("no");
		}
	}
	
	static void solve(List<List<Integer>> ls,int n) {
		Queue<Integer> que=new ArrayDeque<>();
		que.add(n);
		G[n]=n;
		while(!que.isEmpty()) {
			int p=que.remove();
			for(int i=0;i<ls.get(p).size();i++) {
				int next=ls.get(p).get(i);
				if(G[next]==-1) {
					G[next]=n;
					que.add(next);
				}
			}
		}
	}
}

