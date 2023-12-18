import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int u[] = new int[N - 1];
		int v[] = new int[N - 1];
		int w[] = new int[N - 1];
		
		
		LinkedList list[] = new LinkedList[N];
		LinkedList list2[] = new LinkedList[N];
		for(int i = 0; i < N; i++) {
			list[i] = new LinkedList();
			list2[i] = new LinkedList();
		}
		
		for(int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt() - 1;
			v[i] = sc.nextInt() - 1;
			w[i] = sc.nextInt();
			if(w[i] % 2 == 1) {
				list[u[i]].add(v[i]);
				list[v[i]].add(u[i]);
			} else {
				list2[u[i]].add(v[i]);
				list2[v[i]].add(u[i]);
			}
		}
		int ans[] = new int[N];
		Queue<Integer> queue = new ArrayDeque<Integer>();
		Queue<Integer> queue2 = new ArrayDeque<Integer>();
		ans[0] = 0;
		if(list[0].size() != 0) {
		queue.add(0);
		}
		if(list2[0].size() != 0) {
		queue2.add(0);
		}
		Arrays.fill(ans, -1);
		//for(int k = 0; k < N; k++) {
			/*if(ans[k] == -1 && queue.size() == 0) {
				queue.add(k);
				ans[k] = 1;
			}*/
		while(queue.size() != 0 || queue2.size() != 0) {
			int i = 0;
			
			while(queue.size() != 0) {
				i = queue.poll();
				for(int j = 0; j < list[i].size(); j++) {
					if(ans[i] == 1 && ans[list[i].get(j)] == -1) {
						queue.add(list[i].get(j));
						queue2.add(list[i].get(j));
						ans[list[i].get(j)] = 0;
					} else if(ans[list[i].get(j)] == -1){
						queue.add(list[i].get(j));
						queue2.add(list[i].get(j));
						ans[list[i].get(j)] = 1;
					}
				}
			}
			while(queue2.size() != 0) {
				i = queue2.poll();
				for(int j = 0; j < list2[i].size(); j++) {
					if(ans[i] == 1 && ans[list2[i].get(j)] == -1) {
						queue.add(list2[i].get(j));
						ans[list2[i].get(j)] = 1;
						queue2.add(list2[i].get(j));
					} else if(ans[list2[i].get(j)] == -1){
						queue.add(list2[i].get(j));
						ans[list2[i].get(j)] = 0;
						queue2.add(list2[i].get(j));
					}
				}
			}
		}
		while(queue.size() != 0) {
			int i = queue.poll();
				for(int j = 0; j < list[i].size(); j++) {
					if(ans[i] == 1 && ans[list[i].get(j)] == -1) {
						queue.add(list[i].get(j));
						ans[list[i].get(j)] = 0;
					} else if(ans[list[i].get(j)] == -1){
						queue.add(list[i].get(j));
						ans[list[i].get(j)] = 1;
					}
				}
		}
		//}
		for(int i = 0; i < N; i++) {
			System.out.println(ans[i]);
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
