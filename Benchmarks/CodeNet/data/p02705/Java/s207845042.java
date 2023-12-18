import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] A = new int[M];
		
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int j = 0; j < M; j++) {
			sum  += A[j];
		}
		
		int S = N - sum;
		
		if(S >= 0) {
			System.out.println(S);
		}else {
			System.out.println("-1");
		}
	}

}