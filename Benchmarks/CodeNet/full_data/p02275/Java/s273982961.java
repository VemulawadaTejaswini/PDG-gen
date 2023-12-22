import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i;
		int max=0;
		n =sc.nextInt();
		
		int [] A = new int[n+1];
		int [] B = new int[n+1];
		for(i=1;i<A.length;i++){
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

		for(i=n;i>0;i--){
			B[C[A[i]]] = A[i];
			C[A[i]]--;
		}
		System.out.print(B[0]);
		for(i=2;i<B.length-1;i++){
			System.out.print(" "+B[i]);
		}
		System.out.println("");
 
	}

}

