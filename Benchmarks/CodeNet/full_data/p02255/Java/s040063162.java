import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] untreatedArr = new int[N];

		for(int i = 0; i < N; i++){
			untreatedArr[i] = scan.nextInt();
		}

		dispArr(untreatedArr);
		insertionSort(untreatedArr,N);

		scan.close();
	}

	public static void insertionSort(int[] A,int N){
		for(int i = 1; i <= N - 1; i++){
			int v = A[i];
			int j = i - 1;

			while(j >= 0 && A[j] > v){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			dispArr(A);
		}
	}

	public static void dispArr(int[] A){
		for(int i = 0; i < A.length; i++){
			if(i != A.length - 1) System.out.print(A[i] + " ");
			else System.out.println(A[i]);
		}
	}

}