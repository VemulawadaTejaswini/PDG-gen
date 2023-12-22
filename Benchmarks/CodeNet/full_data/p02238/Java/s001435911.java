import java.util.*;
public class Main {
	
	static int time=0,visit[],tstamp[][];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<List<Integer>> ls=new ArrayList<>();
		visit=new int[n]; tstamp=new int[n][2];
		
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
			
			ls.add(new ArrayList<>());
			for(int j=0;j<k;j++) {
				ls.get(u-1).add(Integer.parseInt(in.next())-1);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(visit[i]==0)solve(i,ls);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(i+1+" "+tstamp[i][0]+" "+tstamp[i][1]);
		}
	}
	
	static void solve(int node,List<List<Integer>> ls) {
		visit[node]=1;
		tstamp[node][0]=++time;
		for(int i=0;i<ls.get(node).size();i++) {
			int nxt=ls.get(node).get(i);
			if(visit[nxt]==0)solve(nxt,ls);
		}
		tstamp[node][1]=++time;
	}

}

