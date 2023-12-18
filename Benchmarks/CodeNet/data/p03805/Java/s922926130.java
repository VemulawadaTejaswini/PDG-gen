import java.util.*;

public class Main {
	static int ans = 0;
	static LinkedList list[];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		
		list = new LinkedList[N];
		
		for(int i = 0; i < N; i++) {
			list[i] = new LinkedList();
		}
		for(int i = 0; i < M; i++) {
			list[a[i]].add(b[i]);
			list[b[i]].add(a[i]);
		}
		
		int n = N;
		int perm[] = new int[n];
		boolean flag[] = new boolean[n];
		makePerm(0, perm, flag);
		System.out.println(ans);
	}
	
	static void makePerm(int n, int perm[], boolean flag[]) {
		if(n == perm.length) {
			boolean ansflag = true;
			for(int i = 0; i < perm.length - 1; i++) {
				//System.out.print(perm[i]);
				if(perm[0] == 0) {
					if(!list[perm[i]].linked(perm[i + 1])) {
						ansflag = false;
					}
				} else {
					ansflag = false;
				}
			}
			//System.out.println();
			if(ansflag) {
				ans++;
			}
		} else {
			for(int i = 0; i < perm.length; i++) {
				if(flag[i]) {
					continue;
				} else {
					perm[n] = i;
					flag[i] = true;
					makePerm(n + 1, perm, flag);
					flag[i] = false;
				}
			}
		}
	}
}

class LinkedList {
	ArrayList<Integer> link = new ArrayList<Integer>();
	public void add(int vertex) {
		link.add(vertex);
	}
	
	public int get(int i){
		return link.get(i);
	}
	
	public void remove(int vertex) {
		link.remove(link.indexOf(vertex));
	}
	
	public void view() {
		for(int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i));
		}
	}
	
	public boolean linked(int vertex) {
		if(link.contains(vertex)){
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return link.size();
	}
}