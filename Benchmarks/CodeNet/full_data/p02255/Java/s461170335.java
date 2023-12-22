package Vol0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

	private static int N;
	private static int[] A;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		String[] arrays = br.readLine().split(" ");
		A = new int[N];
		for (int i = 0, idx = 0; i < arrays.length; i++) {
			if(arrays[i].length() == 0) continue;
			A[idx++] = Integer.parseInt(arrays[i].trim());
		}
        System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        }
//		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
//		try {
//		// 挿入ソート
//		for (int i = 1; i < N; i++) {
//			for (int j = i; j >= 1 && A[j] < A[j - 1]; j--) {
//				long tmp = A[j];
//				A[j] = A[j - 1];
//				A[j - 1] = tmp;
//			}
//			System.out.print(A[0]);
//			for (int j = 1; j < N; j++) {
//				System.out.print(" " + A[j]);
//			}
//			System.out.println("");
//
//		}
//		} catch(Exception e){
//			
//		}
	}
}