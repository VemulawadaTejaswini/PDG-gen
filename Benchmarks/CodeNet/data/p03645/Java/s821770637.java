import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] v = new int[N][M];
		int[] idx = new int[N];
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			v[a-1][idx[a-1]++] = b;
			v[b-1][idx[b-1]++] = a;
		}
				
	    end : { for(int i = 0; i < M; i++){
					if(v[0][i] == 0) break;
					if(v[0][i] == M){
						System.out.println("POSSIBLE");
						break end;
					} else {
						for(int j = 0; j < M; j++){
							if(v[v[0][i]][j] == 0) break;
							if(v[v[0][i]][j] == M){
								System.out.println("POSSIBLE");
								break  end;
							}
						}
					}
				}
				System.out.println("IMPOSSIBLE");
			}
	}
}