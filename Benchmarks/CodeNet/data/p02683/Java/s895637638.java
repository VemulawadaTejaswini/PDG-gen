import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int C[] = new int[N];
		int A[][] = new int[N][M];
		for(int i = 0 ; i < N ; ++i){
			C[i] = sc.nextInt();
			for(int j = 0 ; j < M ; ++j){
				A[i][j] = sc.nextInt();
			}			
		}
		int ret = Integer.MAX_VALUE;
		for(int p = 0 ; p < (1 << N) ; ++p){
			int skill[] = new int[M];
			int cost = 0;
			for(int i = 0 ; i < N ; ++i){
				if((p & (1 << i)) == 0){
					continue;
				}
				cost += C[i];
				for(int j = 0 ; j < M ; ++j){
					skill[j] += A[i][j];
				}
			}
			boolean f = true;
			for(int i = 0 ; i < M ; ++i){
				if(skill[i] < X){
					f = false;
				}
			}
			if(f){
				ret = Math.min(ret, cost);				
			}
		}
		if(ret == Integer.MAX_VALUE){
			System.out.println(-1);
		}else{
			System.out.println(ret);
		}
	}
}
