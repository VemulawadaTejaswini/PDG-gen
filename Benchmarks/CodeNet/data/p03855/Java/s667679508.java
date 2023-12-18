import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> klist;
	ArrayList<ArrayList<Integer>> llist;
	boolean kused[];
	boolean lused[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=sc.nextInt();
		klist = new ArrayList<ArrayList<Integer>>();
		llist = new ArrayList<ArrayList<Integer>>();
		kused = new boolean[n+1];
		lused = new boolean[n+1];
		for(int i=0; i<=n; i++) {
			klist.add(new ArrayList<Integer>());
			llist.add(new ArrayList<Integer>());
		}
		for(int i=0; i<k; i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			klist.get(p).add(q);
			klist.get(q).add(p);
		}
		for(int i=0; i<l; i++) {
			int r=sc.nextInt();
			int s=sc.nextInt();
			llist.get(r).add(s);
			llist.get(s).add(r);
		}

		for(int i=1; i<=n; i++) {
			if(!kused[i] && klist.get(i).size()>0) {
				dfs(i, klist, kused);
			}
			if(!lused[i]&& llist.get(i).size()>0) {
				dfs(i, llist, lused);
			}
		}

		for(int i=1; i<=n; i++) {
			int cnt = 0;
			if(kused[i]) cnt++;
			if(lused[i]) cnt++;
			if(i>1)System.out.print(" ");
			System.out.print(cnt);
		}
		System.out.println();
		sc.close();
	}

	public void dfs(int s, ArrayList<ArrayList<Integer>> list, boolean[] used) {
		ArrayDeque<Integer> g = new ArrayDeque<Integer>();
		g.add(s);
		used[s]=true;
		while(!g.isEmpty()) {
			int p = g.pop();
			ArrayList<Integer> k = list.get(p);
			for(int i=0; i<k.size(); i++) {
				int q=k.get(i);
				if(p != q && ! used[q]) {
					g.add(q);
					used[q]=true;
				}
			}
		}
	}
}
