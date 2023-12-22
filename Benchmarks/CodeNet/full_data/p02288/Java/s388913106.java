import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		
		String[] s = br.readLine().split(" ");
		int A[] = new int[h];
		for(int i = 0; i < h; i++) {
			A[i] = Integer.parseInt(s[i]);
		}
		buildMaxHeap(A);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < h; ++i) {
			sb.append(" " + A[i]);
		}
		System.out.println(sb);
	}
	public static void maxHeapify(int[] A, int i){
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		int largest;
		int h = A.length;
		if (l < h && A[l] > A[i]){
			largest = l;
		}else{
			largest = i;
		}
		if(r < h && A[r] > A[largest]){
			largest = r;
		}
		
		if(largest != i){
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			maxHeapify(A, largest);
		}
	}
	public static void buildMaxHeap(int[] A){
		for(int i = A.length/2 - 1; i >= 0; --i){
			maxHeapify(A, i);
		}
	}
}