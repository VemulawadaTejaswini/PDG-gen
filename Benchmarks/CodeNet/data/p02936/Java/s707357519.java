import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


class Act implements Comparable<Act>{
	int p;
	int q;
	public Act(int p,int q) {
		this.p=p;this.q=q;
	}
	@Override
	public int compareTo(Act o) {
		// TODO 自動生成されたメソッド・スタブ
		return this.p-o.p;
	}

}

//D
public class Main {




	//static int[] A=new int[200000];
	static int N;
	static int Q;
	static LinkedList<Integer>[] v;
	static int[] ans;
	static int[] parent;
	public static void f(int p,int q) {
		ans[p]+=q;
		for(int b:v[p]) {
			f(b,q);
		}
	}

	//public static final long MOD = 1000000007;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		N=sc.nextInt();
		Q=sc.nextInt();
		v=new LinkedList[N+1];
		ans=new int[N+1];
		parent=new int[N+1];
		for(int i=1;i<=N;i++) {
			v[i]=new LinkedList<Integer>();
		}
		for(int i=1;i<=N-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			v[a].add(b);
			parent[b]=a;

		}
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<Q;i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			if(map.containsKey(p)) {
				map.put(p, map.get(p)+q);
			}else {
				map.put(p, q);
			}
		}
		

		for(int p:map.keySet()) {
			int q=map.get(p);
			
			System.err.println(p+" "+q);
		}

		ans[1]=map.get(1);
		for(int i=2;i<=N;i++) {
			
			int pi=parent[i];
			System.err.println("i pi "+i+" "+pi);
			
			if(pi!=0) {ans[i]=ans[pi];}
			if(map.containsKey(i)) {ans[i]+=map.get(i);}
			
		}
		
		for(int i=1;i<=N;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

}
