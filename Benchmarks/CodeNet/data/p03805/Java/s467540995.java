import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] edge = new int[2 * M][2];
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] edge1 = {a, b};
			int[] edge2 = {b, a};
			edge[i] = edge1;
			edge[i + M] = edge2;
		}
		
		int ans = 0;
		ArrayList<ArrayList<Integer>> queue = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(1);
		queue.add(s);
		
		while(queue.size() != 0){
			
			ArrayList<Integer> state = queue.remove(0);
			if(state.size() == N){
				ans++;
				continue;
			}
			int lastNode = state.remove(state.size()-1);
			
			for(int i = 0; i < 2 * M; i++){
				
				if(edge[i][0] == lastNode){
					int nextNode = edge[i][1];
					if(!state.contains(nextNode)){
						ArrayList<Integer> nextState = new ArrayList<Integer>();
						for(Integer node : state) nextState.add(node);
						nextState.add(lastNode);
						nextState.add(nextNode);
						queue.add(nextState);
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}