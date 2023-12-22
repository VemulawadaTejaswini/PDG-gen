import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] lineArray = br.readLine().split(" ");
		editLine(lineArray);
		insertionSort(lineArray, N);
	}
	
	void insertionSort(String[] A, int N) {
	   for(int i = 1; i <= N - 1; i++) { 
	     String v = A[i];
	     int j = i - 1;
	     while(j >= 0 && A[j].compareTo(v) > 0) {
	     	A[j+1] = A[j];
	     	j--;
	     	A[j+1] = v;
	     }
	   editLine(A);
	   }
	}
	
	void editLine(String[] A) {
		for(int k = 0; k < A.length; k++) { 
			if(k != A.length - 1) {
				System.out.print(A[k] + " ");
			} else {
				System.out.println(A[k]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}