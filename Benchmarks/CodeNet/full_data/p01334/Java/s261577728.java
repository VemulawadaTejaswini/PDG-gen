import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] x = new int[n][n];
			int[][] y = new int[n][n];
			int[][] loop = new int[n][n];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					x[i][j] = sc.nextInt();
					y[i][j] = sc.nextInt();
				}
			}
			
			int cnt = 1;
			int p, q, r, u, v;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(loop[i][j]==0){
						p = i;
						q = j;
						while(true){

							if(loop[p][q]==cnt){
								cnt++;
								break;
							}else if(loop[p][q]==0){
								loop[p][q] = cnt;
								u = p;
								v = q;
								p = y[u][v];
								q = x[u][v];
							}else{
								r = loop[p][q];
								for(int a=0;a<n;a++){
									for(int b=0;b<n;b++){
										if(loop[a][b]==cnt) loop[a][b] = r;
									}
								}
								break;
							}
						}
					}
				}	
			}

			System.out.println(cnt-1);
		}	
	}	
}