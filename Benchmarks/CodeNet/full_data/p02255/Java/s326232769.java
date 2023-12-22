import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();

		}
		print(A);
		sc.close();
		insertionSort(A, N);

	}


	private static void insertionSort(int A[], int N){
		for (int i = 1; i < N ; i++) {
			int v = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > v){
				A[j + 1] = A[j];
				j--;
				A[j + 1] = v;
			}
			print(A);
		}
	}

	static void print(int array[]){
		for (int i = 0; i < array.length; i++) {
			if(i == array.length -1){
				System.out.println(array[i]);
			}else{
				System.out.print(array[i] + " ");
			}
		}
	}
}
