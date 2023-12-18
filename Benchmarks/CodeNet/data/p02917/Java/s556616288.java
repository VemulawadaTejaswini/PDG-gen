import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[150];
		int[] B = new int[150];
		for(int i=0; i<N-1;i++) {
			B[i]=scan.nextInt();			
		}
		for(int i=1; i<N-1;i++) {
			A[i]= Math.min(B[i], B[i-1]);
			
		}
		A[0] =B[0];
		A[N-1]= B[N-2];
		int ans= Arrays.stream(A).sum(); 
		System.out.println(ans);
	}
}
		
	