import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[M][2];
		for(int i = 0 ; i < M ; i++){
			A[i][0]  = sc.nextInt();
			A[i][1]  = sc.nextInt();
		}
		sc.close();
		boolean flag = false;
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i = 0 ; i < M ; i++){
			if(A[i][0] == N){
				queue.add(A[i][1]);
			}
			if(A[i][1] == N){
				queue.add(A[i][0]);
			}
		}
		outside:
		while(!queue.isEmpty()){
			int p = queue.poll();

			for(int i = 0 ; i < M ; i++){
				if((A[i][0] == p && A[i][1] == 1) || (A[i][1] == p && A[i][0] == 1)){
					flag = true;
					break outside;
				}
			}
		}

		if(flag){
			System.out.println("POSSIBLE");
		}
		else{
			System.out.println("IMPOSSIBLE");
		}
	}
}