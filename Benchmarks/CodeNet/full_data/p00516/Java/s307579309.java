import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//競技数
		int M = sc.nextInt();//委員の人数
		int A[] = new int[N];//費用Ai
		int B[] = new int[M];//各委員の審査基準Bj
		int Ap[] = new int[N];//競技iへの投票数
		int i,j;
		int a = 0;
		
		for(i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		for(j = 0; j < M; j++){
			B[j] = sc.nextInt();
		}
		
		for(i = 0; i < N; i++){
			for(j = 0; j < M; j++){
				if(A[i] <= B[j]){
					Ap[i]++;
					B[j] = 0;
				}
			}
		}
		
		int ApMAX = Ap[0];
		for(i = 1; i < N; i++){//Apの大きさを比べて一番のものを出力
			if(Ap[i] > ApMAX){
				ApMAX = Ap[i];
			}
		}
	
		System.out.println(ApMAX);
	
	
	}
	

}