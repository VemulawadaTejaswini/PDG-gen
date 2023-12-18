import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		for(int i=0; i<M; i++){
			A[i] = sc.nextInt();
		}
		sc.close();

		int ret = getProcess(N, A);

		System.out.println(ret);
	}

	public static int getProcess(int N, int[] A){
		int sum = 0;
		for(int i=0; i<A.length; i++){
			sum += A[i];
		}

		N -= sum;
		if(N < 0){
			N = -1;
		}

		return N;
	}


}