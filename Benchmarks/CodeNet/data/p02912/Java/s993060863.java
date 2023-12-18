import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<M;i++) {
			Arrays.sort(A);
			int num = A.length-1;
			A[num] = A[num]/2;
		}
		
		long total = 0;
		for(int a:A) {
			total += a;
		}
		
		System.out.println(total);
		
		sc.close();	
	}
}