import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int S = sc.nextInt();
		int[] A = new int[S];
	
		int sum = 0;
		for(int i =0; i<S; i++) {
			A[i]  = sc.nextInt();
				
			
			
			
		}
		Arrays.sort(A);
		int temp = A[S-1]/2;
		A[S-1] = 0;
		for(int i =0; i<S; i++) {
			sum = sum + A[i];
		}
		System.out.println(sum + temp);
		
		
		
	}

}
