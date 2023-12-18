import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力(NとMとC)
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int judge = C;
		int answer = 0;
		int [][] A = new int[N-1][M-1];
		int [] B = new int[M-1];
		for(k=0;k<M;k++){
			B[k] = sc.nextInt();
		}
		for(i=0;i<N;i++){
			for(j=0;j<M;j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<N;i++){
			for(j=0;j<M;j++){
				judge =+ A[i][j]*B[j];
			}
			if(judge > 0){
				answer++;
				}
			judge = C;
		}
		System.out.println(count);
	}
}

