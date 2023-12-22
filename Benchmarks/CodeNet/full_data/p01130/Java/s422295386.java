import java.util.Scanner;

public class Main {
	public static final int MAX = Integer.MAX_VALUE/10;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
		int V = in.nextInt();
		if(V==0) break;
		int E = in.nextInt();
		int s = in.nextInt()-1;
		int g1 = in.nextInt()-1;
		int g2 = in.nextInt()-1;
		int[][] road = new int[V][V];
		for (int i=0;i<V;i++) {
			for(int j=0;j<V;j++){
				road[i][j] = (i==j)?0:MAX;
			}
		}
		for(int i=0;i<E;i++){
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			int c = in.nextInt();
			road[a][b] = c;
			road[b][a] = c;
		}
		
		for(int i=0;i<V;i++){
			for(int j=0;j<V;j++){
				System.out.print(road[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k=0;k<V;k++){
			for(int i=0;i<V;i++){
				for(int j=0;j<V;j++){
					road[i][j] = Math.min(road[i][j],road[i][k]+road[k][j]);
				}
			}
		}
		
		for(int i=0;i<V;i++){
			for(int j=0;j<V;j++){
				System.out.print(road[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<V;i++){
			ans = Math.min(ans,road[s][i]+road[i][g1]+road[i][g2]);
			System.out.println(i +":"+ans);
		}
		
		System.out.println(ans);
		System.gc();
		}
	}
}