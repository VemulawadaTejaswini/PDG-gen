import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int n = io.nextInt();
		int m = io.nextInt();
		int[][] e = new int[n][n];
		
		for(int i=0;i<m;i++){
			int x = io.nextInt()-1;
			int y = io.nextInt()-1;
			e[x][y] = 1;
			e[y][x] = 1;
		}
		System.out.println(goWay(e,new boolean[n],0));
		
	}
	
	public static int goWay(int[][] e, boolean[] visited,int node){
		visited[node] = true;
		int total = 0;
		int allnode = 0;
		for(int i=0;i<visited.length;i++){
			if(visited[i]==true){
				allnode ++;
			} else if(e[node][i]==1){
				total += goWay(e,visited,i);
			}
		}
//		System.out.println("NODE:"+(node+1)+" allnode:"+allnode+" total"+total);
		visited[node] = false;
		if(allnode == visited.length) return 1;
		return total;
	}
}