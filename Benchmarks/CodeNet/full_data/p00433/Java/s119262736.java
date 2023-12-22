import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[4];
		int[] B = new int[4];
		
		int S = 0, T = 0;
		
		for(int i = 0; i < 4; i++) {
			A[i] = sc.nextInt();
			S+=A[i];
		}
		
		for(int i = 0; i < 4; i++) {
			B[i] = sc.nextInt();
			T+=B[i];
		}
		
		if(S > T) {
			System.out.println(S);
		} else {
			System.out.println(T);
		}
	}
}