import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] T = new int[N];
		for(int i = 0;i<N;i++) {
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];
			
		for(int i=0;i < M;i++){
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}

		for(int i=0;i<M;i++){
			int sum = 0;
			for(int j=0;j<N;j++){
				if(P[i] - 1 == j){
					sum += X[i];
				} else {
					sum += T[j];
				}
			}
			System.out.println(sum);
		}	
	}
}
