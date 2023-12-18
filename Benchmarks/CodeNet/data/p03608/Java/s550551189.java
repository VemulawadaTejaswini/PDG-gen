import java.util.*;
public class Main {
	
	static int N, R;
	static int dist[][];
	static int [] needtovis;
	static boolean [] visited;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		R = sc.nextInt();
		
		dist = new int[N+1][N+1];
		needtovis = new int[R+1];
		visited = new boolean[R+1];
		for(int i = 1 ;i<=R; i++) needtovis[i] = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=N; j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
			dist[i][i] = 0;
		}
		
		for(int i = 1; i<=M; i++) {
			int a = sc.nextInt(),  b = sc.nextInt(), w = sc.nextInt();
			dist[a][b] = dist[b][a] = w;
		}
				
		
		
		for(int k = 1; k<=N; k++) {
			for(int i = 1; i<=N; i++) {
				for(int j = 1; j<=N; j++) {
					if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE)
					dist[j][i] = dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		
		for(int i = 1; i<=N; i++) dist[i][0] = dist[0][i] = 0;
		
		System.out.println(permgenerator(0, 0, 0));
	}
	
	public static int permgenerator(int length, int crntcity, int numCity){
			
		if(numCity == R) return length;
		
//		System.out.println(length);
		
		int min = Integer.MAX_VALUE;
		for(int i = 1; i<=R; i++) {
			if(!visited[i]) {
				visited[i] = true;
				min = Math.min(permgenerator(length + dist[crntcity][needtovis[i]], needtovis[i], numCity+1), min);
				visited[i] = false;
			}
		}
		
		return min;		
		
	}
	
}
