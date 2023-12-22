import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i;
		int max=0;
		n =sc.nextInt();
		
		int [] A = new int[n];
		int [] B = new int[n];
		for(i=0;i<n;i++){
			A[i] =sc.nextInt();
			if(A[i]>max) max = A[i];
		}
		
		int [] C = new int[max+1];
		for(i=0;i<C.length;i++){
			C[i] =0;
		}
		
		for(i=0;i<C.length;i++){
			C[A[i]]++;
		}
		
		for(i=1;i<C.length;i++){
			C[i] = C[i] +C[i-1];
		}
	
		for(i=n-1;i>=0;i--){
			B[C[A[i]]] = A[i];
			C[A[i]]--;
		}
		System.out.print(B[0]);
		for(i=1;i<n;i++){
			System.out.print(" "+B[i]);
		}
		System.out.println("");
 
	}

}

