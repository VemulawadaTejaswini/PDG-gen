import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int N=sc.nextInt();

		int a[];
		a=new int[N];

		for(int i=0;i<N;i++)
			a[i]=sc.nextInt();

		insertionSort(a,N);

	}

	private static void insertionSort(int A[], int N) {

		int v,j;
		
		for(int i=0;i<N-1;i++)
			System.out.print(A[i]+" ");
		System.out.println(A[N-1]);

		for (int i=1;i<N;i++) {
			v = A[i];
			j = i - 1;
			while( j >= 0 &&A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;

			for(int k=0;k<N-1;k++)
				System.out.print(A[k]+" ");
			System.out.println(A[N-1]);
		}

	}


}
