import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int j = 0; j < n; j++){
			a[j] = scan.nextInt();
		}
		scan.close();
		InsertionSort(a, n);
	}

	static void InsertionSort(int A[], int N){
		print(A);
		for(int i = 1; i <= N - 1; i++){
			int v = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > v){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			print(A);
		}
	}

	static void print(int A[]){
		for(int k = 0; k < A.length; k++){
			if(k == A.length - 1){
				System.out.println(A[k]);
			}else{
				System.out.print(A[k] + " ");
			}
		}
	}
}