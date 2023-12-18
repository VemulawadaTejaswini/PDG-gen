import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		ArrayList<int[]> listEdge = new ArrayList<int[]>();
		//boolean[][] edge = new boolean[M+1][M+1];
		boolean[] visited = new boolean[N+1];
		int count = 0;
		
		for(int i = 0; i < M; i++){
			int[] edge = {in.nextInt(), in.nextInt()};
			listEdge.add(edge);
		}
		
		for(int j = 0; j < M; j++){
			int[] rem = listEdge.remove(0);
			
			Arrays.fill(visited, false);
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.addFirst(1);
			visited[1] = true;
			
			while(queue.size() != 0){
				int q = queue.remove(0);
				for(int i = 0; i < listEdge.size(); i++){
					int[] edge = listEdge.get(i);
					if(edge[0] == q && !visited[edge[1]]){
						visited[edge[1]] = true;
						queue.addFirst(edge[1]);
					}else if(edge[1] == q && !visited[edge[0]]){
						visited[edge[0]] = true;
						queue.addFirst(edge[0]);
					}
				}
			}
			
			
			boolean isBridge = false;
			for(int i = 1; i <= N; i++){
				if(!visited[i]){
					isBridge = true;
					break;
				}
			}
			if(isBridge) count++;
			
			listEdge.add(rem);
		}
		
		System.out.println(count);		
	}
}
