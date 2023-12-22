import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Dominating Set
public class Main{

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			Set<Integer>[] adj = new Set[n];
			for(int i=0;i<n;i++)adj[i]=new HashSet<Integer>();
			while(m--!=0){
				int s = sc.nextInt(), t = sc.nextInt();
				adj[s].add(t); adj[t].add(s);
			}
			Set<Integer> set = new HashSet<Integer>();
			int res = 0;
			for(int i=0;i<n;i++){
				if(adj[i].isEmpty())res++;
				else set.add(i);
			}
			while(!set.isEmpty()){
//				System.out.println("Set:"+set.size());
//				for(int x:set)System.out.println(x);
				int min = n, max = -1, m1 = -1, m2 = -1;
				for(int x:set){
					if(adj[x].size() < min){
						min = adj[x].size();
						m1 = x;
					}
					if(max < adj[x].size()){
						max = adj[x].size();
						m2 = x;
					}
				}
//				System.out.println(min+" "+m1+" "+max+" "+m2);
				if(min==1){
					int p = -1;
					for(int x:adj[m1])p=x;
//					System.out.println("MIN:"+p);
					Set<Integer> del = new HashSet<Integer>();
					del.add(p);
					for(int x:adj[p])del.add(x);
//					System.out.println("DEL:"+del.size());
//					for(int x:del)System.out.println(x);
					for(int s:set)adj[s].removeAll(del);
					set.removeAll(del);
				}
				else{
					Set<Integer> del = new HashSet<Integer>();
					del.add(m2);
					for(int x:adj[m2])del.add(x);
					for(int s:set)adj[s].removeAll(del);
					set.removeAll(del);
				}
				res++;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}