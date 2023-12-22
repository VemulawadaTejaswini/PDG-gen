package ex1;
import java.util.Scanner;
ProbremA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,key;
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int [] A = new int [N];
		
		for(i=0; i<N; i++){
			A[i] =sc.nextInt();
		}
		
		for(i=0; i<N; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		for(i=1; i<N; i++){
			key = A[i];
			for(j=i-1;j>=0;j--){
				if(key<A[j]){
					A[j+1] = A[j];
					A[j] = key;
				}
			}
			for(int r=0; r<N; r++){
				System.out.print(A[r]+" ");
			}
			System.out.println();

		}

	}

}

