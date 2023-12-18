import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[]used=new boolean[n];
		Arrays.fill(used, false);
		ArrayList<Integer>[]path=new ArrayList[n];
		for(int i=0;i<n;i++) {
			path[i]=new ArrayList<Integer>();
		}
		int[]a=new int[m];
		int[]b=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(a[i]);
		}
		Stack<Integer>ans=new Stack<Integer>();
		int start=0;
		used[start]=true;
		ans.push(start);
		int end=start;
		while(true) {
			int next=-1;
			for(int i=0;i<path[end].size();i++) {
				if(!used[path[end].get(i)]) {
					next=path[end].get(i);
					ans.push(next);
					used[next]=true;
					end=next;
					break;
				}
			}
			if(next==-1)break;
		}
		System.out.println(ans.size());
		while(!ans.isEmpty()) {
			System.out.print(ans.pop()+1);
			if(!ans.isEmpty())System.out.print(" ");
		}
		System.out.println();
	}
}
