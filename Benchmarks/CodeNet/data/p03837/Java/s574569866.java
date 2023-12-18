import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][]data = new int[N+1][N+1];
		int[][]judge = new int[N+1][N+1];
		for(int i = 0 ; i<M; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			data[l][r] = v;
			data[r][l] = v;
			judge[r][l] = v;
			judge[l][r] = v;
		}
		
	/*	System.out.println("- - - - - - - - - - - ");
		for(int i = 1 ; i<=N; i++){
			System.out.println(Arrays.toString(data[i]));
		}
		
		System.out.println();
		
		for(int i = 1 ; i<=N; i++){
			System.out.println(Arrays.toString(judge[i]));
		}
		System.out.println("- - - - - - - - - - - -");*/
		
		for(int k = 1; k<=N; k++){
			for(int i = 1; i<=N; i++){
				for(int j = 1; j<=N; j++){
			//		System.out.println(judge[i][k] + judge[k][j]+"   "+judge[i][j]);
			//		System.out.println();
					judge[i][j] = Math.min(judge[i][k] + judge[k][j] , judge[i][j]);
				//	
					
				}
			}
		}
		long res = 0;
		for(int i = 1; i<=N; i++){
			for(int j = i; j<=N; j++){
				if(judge[i][j] != data[i][j])res++;
			}
		}
		
	/*	System.out.println("- - - - - - - - - - - ");
		for(int i = 1; i<=N; i++){
			for(int j = 1; j<=N; j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1 ; i<=N; i++){
			System.out.println(Arrays.toString(judge[i]));
		}
		System.out.println("- - - - - - - - - - - -");*/
		
		
		System.out.println(res);
	}
}
