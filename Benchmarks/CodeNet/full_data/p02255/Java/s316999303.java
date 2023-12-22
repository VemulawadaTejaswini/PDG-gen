import java.util.Scanner;

class Main{

	public static void insertionSort(int A[],int N){
		for(int k=0;k<N-1;k++){
			System.out.print(A[k]+" ");
		}
		System.out.println(A[N-1]);
		for(int i=1;i<N;i++){
			int v=A[i];
			int j=i-1;
			while(j>=0 && A[j]>v){
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=v;
			for(int k=0;k<N-1;k++){
				System.out.print(A[k]+" ");
			}
			System.out.println(A[N-1]);
		}
		
	}

	public static void  main(String[] args){
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int array[]=new int[n];

		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();

		insertionSort(array,n);
		
		
			
		scan.close();
	}

}