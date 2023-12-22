import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int mid = N / 2;
		System.out.println(1+" "+N);
		for (int i = 1; i < M; i++) {
			System.out.println((mid-i)+" "+(mid+i+1));
		}
		/*
		int j = N-1;
		for (int i = 1; i <= M; i++) {
			System.out.println(i+" "+j);
			j--;
		}
		//System.out.println(N/2+" "+N);
		*/
		
	}
}