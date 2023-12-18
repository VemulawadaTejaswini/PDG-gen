import java.util.*;
public class Mains{

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int []A = new int[N];
		int total = X;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			for(int a = 0; a < D; a+=A[i]) {
				total++;
			}
		}
		System.out.println(total);
		
	}
}
