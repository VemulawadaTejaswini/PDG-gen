import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String li = new String();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			 li = li = bufferedReader.readLine(); 
		} catch (IOException e) {
			System.out.println("e");
		}
		int size = Integer.parseInt(li);
		String[] line = new String[size]; 
		try {
			line = bufferedReader.readLine().split(" ");
		} catch (IOException e) {
			System.out.println(e);
		}
		int A[] = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = Integer.parseInt(line[i]);
		}
		int B[] = new int[size + 1];
		countingSort(A, B, 10001);
	}

	static void countingSort(int[] A, int[] B, int k) {
		int C[] = new int[k];
		int aLength = A.length;
		int bLength = B.length;
		for (int i = 0; i < aLength; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < k; i++) {
			C[i] += C[i - 1];
		}
		for (int i = aLength - 1; i >= 0; i--) {
			int p = A[i];
			B[C[p]] = p;
			C[p]--;
		}
		for (int i = 1; i < bLength; i++) {
			if (i == bLength - 1) {
				System.out.println(B[i]);
			} else {
				System.out.print(B[i] + " ");
			}
		}
	}

}