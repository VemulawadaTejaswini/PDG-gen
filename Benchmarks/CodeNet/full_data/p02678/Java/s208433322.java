import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Yes");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) array.add(new ArrayList<Integer>());
		for(int i=0;i<m;i++) {
			int a=sc.nextInt()-1, b=sc.nextInt()-1;
			array.get(a).add(b);
			array.get(b).add(a);
		}
		sc.close();
		//BFS
		HashSet<Integer> closed = new HashSet<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		int[] from = new int[n];
		q.add(0);
		while(!q.isEmpty()) {
			int now=q.poll();
			closed.add(now);
			ArrayList<Integer> temp = array.get(now);
			for(int i=0;i<temp.size();i++) {
				if(!closed.contains(temp.get(i))) {
					from[temp.get(i)]=now+1;
					closed.add(temp.get(i));
					q.add(temp.get(i));
				}
			}
		}
		for(int i=1;i<n;i++) System.out.println(from[i]);
	}
}