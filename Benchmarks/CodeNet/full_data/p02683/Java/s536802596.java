import java.util.*;
public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
      	int N2 = (int)Math.pow(2,N);
		int cost = 0;
		int[] C = new int[N];
		int[][] A = new int[N][M];
		int[][] reach = new int[N2][M];
      	boolean[] flag = new boolean[N2];
      	int ans = 0;
      	boolean ta = false;
		for(int i = 0;i<N;i++){
			C[i] = sc.nextInt();
          	ans += C[i];
			for(int j = 0;j<M;j++){
				A[i][j] = sc.nextInt();
			}
		}
      	ans++;	
		for(int i=0;i<N2;i++){
			for(int j=0;j<N;j++){
				if((1 & i>>j)==1){
					cost += C[j];
					for(int k=0;k<M;k++){
						reach[i][k] += A[j][k];
					}
				}
			}
          	for(int k=0;k<M;k++){
            	if(reach[i][k]<X){
                  	flag[i]=false;
                  	break;
                }
              	if(reach[i][k]>=X) flag[i]=true;
              	if(flag[i]){
                	ans = Math.min(ans,cost);
                  	ta = true;
                }
            }
          	cost = 0;
		}
      	if(ta) System.out.println(ans);
      	else System.out.println(-1);
	}
}