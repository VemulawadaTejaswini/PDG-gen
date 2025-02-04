
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int INF = 100000000;
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int V = stdIn.nextInt();
		int E = stdIn.nextInt();
		int[][] d = new int[V][V];
		for(int i=0;i<V;i++){
			Arrays.fill(d[i],INF);
			d[i][i] = 0;
		}
		
		for(int i=0;i<E;i++){
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			int l = stdIn.nextInt();
			d[s][t] = l;
		}
		
		for(int i=0;i<V;i++){
			for(int j=0;j<V;j++){
				for(int k=0;k<V;k++){
					if(d[j][i]+d[i][k]<d[j][k]){
						d[j][k] = d[j][i]+d[i][k];
						if(i==V-1){
							System.out.println("NEGATIVE CYCLE");
							return;
						}
					}
				}
			}
		}
		
		for(int i=0;i<V;i++){
			for(int j=0;j<V;j++){
				if(d[i][j]>=INF/2){
					System.out.print("INF");
				}
				else{
					System.out.print(d[i][j]);
				}
				if(j!=V-1){
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
}