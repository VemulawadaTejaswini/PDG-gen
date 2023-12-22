import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] A = new int[N];
		String [] str = br.readLine().split(" ");
		for(int i = 0;i < str.length;i++){
			A[i] = Integer.parseInt(str[i]);
		}
		insertionSort(A,N);
	}

	public static void insertionSort(int[] A,int N){
		show(A);
		for(int i=1; i<N;i++){
			int v = A[i];
			int j = i-1;
			while(j>=0 && A[j] > v){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			show(A);
		}
	}

	public static void show(int []A){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < A.length;i++){
			sb.append(A[i]);
			if(i != A.length-1) sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}