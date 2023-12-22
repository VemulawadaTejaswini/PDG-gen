import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] data = new int[n];

		for(int i = 0; i < n; i++){
			data[i] = Integer.parseInt(br.readLine());
		}

		sortManager.shellSort(data, n);

		System.out.println(sortManager.cnt);

		for(int i = 0; i < n; i++){
			System.out.println(data[i]);
		}
	}

}

class sortManager {
	public static int cnt = 0;

	public static void insertionSort(int[] A, int n, int g){
		for(int i = g; i <= n-1; i++){
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v){
				A[j+g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j+g] = v;
		}
	}

	public static void shellSort(int[] A, int n){
		cnt = 0;
		//int[] G = {121,40,13,4,1};
		int[] G = {4, 1};
		int m = G.length;

		System.out.println(m);

		for(int i = 0; i <= m-1; i++){
			System.out.print(G[i]);
			if(i != m-1){
				System.out.print(" ");
			}
			insertionSort(A, n, G[i]);
		}
		System.out.println();
	}
}