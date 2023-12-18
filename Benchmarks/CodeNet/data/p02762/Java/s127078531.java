import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();

		//友人，ブロック，無関係
		ArrayList<ArrayList<Integer>> friends = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> blocked = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> nothing = new ArrayList<ArrayList<Integer>>();

		for(int i = 0; i < N; i++){
			ArrayList<Integer> x = new ArrayList<Integer>();
			ArrayList<Integer> y = new ArrayList<Integer>();
			ArrayList<Integer> z = new ArrayList<Integer>();
			friends.add(x);
			blocked.add(y);
			nothing.add(z);
		}
		
		for(int i = 0; i < M; i++){
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			friends.get(a).add(b);
			friends.get(b).add(a);
		}

		for(int i = 0; i < K; i++){
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			blocked.get(a).add(b);
			blocked.get(b).add(a);
		}

		for(int i = 0; i < N - 1; i++){
			for(int j = i + 1; j < N; j++){
				if(!friends.get(i).contains(j) && !blocked.get(i).contains(j)){
					nothing.get(i).add(j);
					nothing.get(j).add(i);
				}
			}
		}
		
		for(int i = 0; i < N; i++){
			int count = 0;
			ArrayList<Integer> vertexes = new ArrayList<Integer>(BFS(i, friends));
			
			for(int j = 0; j < nothing.get(i).size(); j++){
				int v = nothing.get(i).get(j);
				if(vertexes.contains(v))count++;
			}
			
			System.out.print((i != N-1)?count + " ":count);
		}
	}
	
	static ArrayList<Integer> BFS(int start, ArrayList<ArrayList<Integer>> graph){
		ArrayList<Integer> visited = new ArrayList<Integer>();
		
		boolean seen[] = new boolean[graph.size()];
		Arrays.fill(seen, false);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		//BFS
		seen[start] = true;
		queue.add(start);
		
		while(queue.size() > 0){
			int v = queue.poll();
			for(int i = 0; i < graph.get(v).size(); i++){
				int t = graph.get(v).get(i);
				if(!seen[t]){
					seen[t] = true;
					queue.add(t);
					visited.add(t);
				}
			}
		}
		return (visited);
	}
}