import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		long ans = 0;

		if(N != 1){

			A[0] = stdIn.nextInt();
			if(A[0] == 0){
				A[0] = 1;
				for(int i = 1;i < N;i++){
					int D = stdIn.nextInt();
				
					A[D]++;
					//System.out.println(A[D]);
				}
			
				ans = 1;
			
				for(int i = 0;i < N - 1;i++){
					//System.out.println(ans);
					ans = ans * (long)Math.pow(A[i],A[i + 1]);
				}
			}

			if(A[0] != 1){
				ans = 0;
			}
		}
		
		//int M = stdIn.nextInt();
		
		
		//int[] B = new int[M];

		//int[] root = new int[M];
		ans = ans % 998244353;
		System.out.println(ans);
	}
}