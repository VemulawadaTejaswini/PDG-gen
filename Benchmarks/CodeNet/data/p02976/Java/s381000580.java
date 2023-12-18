import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNode = sc.nextInt();
		int numEdge = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer> connect[] = new ArrayList[numNode];
		for(int i = 0; i < numNode; i ++) {
			connect[i] = new ArrayList<>();
		}
		for(int i = 0; i < numEdge; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			connect[a].add(b);
			connect[b].add(a);
		}

		System.err.println();
		for(int i = 0; i < numNode; i ++) {
			for(int j = 0; j < connect[i].size(); j ++) {
				System.err.print(connect[i].get(j)+" ");
			}
			System.err.println();
		}

		if(numEdge % 2 != 0) { System.out.println(-1); return; }

		visited = new int[numNode];
		odd = new boolean[numNode];
		dfs(connect, -1, 0);
	}

	static int visited[];
	static boolean odd[];
	static void dfs(ArrayList<Integer> connect[], int parent, int crt) {
		System.err.println("crt:"+crt);
		visited[crt] = 1;
		ArrayList<Integer> crtConnect = connect[crt];
		for(int i = 0; i < crtConnect.size(); i ++) {
			int child = crtConnect.get(i);
			System.err.println("child:"+child);
			if(child == parent || visited[child] == 1) {
				continue;
			}else if(visited[child] == 2) {
				System.out.println((crt + 1)+" "+(child + 1));
				odd[crt] = !odd[crt];
			}else {
				dfs(connect, crt, child);
				if(odd[child]) {
					System.out.println((child + 1)+" "+(crt + 1));
					odd[child] = !odd[child];
				}else {
					System.out.println((crt + 1)+" "+(child + 1));
					odd[crt] = !odd[crt];
				}
			}
		}
		visited[crt] = 2;
	}
}