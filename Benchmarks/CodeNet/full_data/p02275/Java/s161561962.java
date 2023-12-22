import java.io.*;

public class Algo21{

	static int count = 0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		int max = 0;
		int[] A = new int[n];
		int[] B = new int[n];
		String[] in = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(in[i]);
			max = Math.max(max, A[i]);
		}

		countingSort(A, B, max);
		sb.append(B[0]);
		for(int i = 1; i < n; i++)
			sb.append(" ").append(B[i]);
		System.out.printf("%s\n", sb);
	}

	private static void countingSort(int[] a, int[] b, int max){ // ?¨???°?????????
		int[] C = new int[max+1];

		for(int j = 0; j < a.length; j++){
			C[a[j]]++;
		}

		for(int i = 1; i <= max; i++){
			C[i] = C[i] + C[i-1]; // ?¨???°???
		}

		for(int j = a.length-1; j >= 0; j--){
			b[C[a[j]]-1] = a[j]; // ?¨???°??????????´???°??¨????????????????????????0??????k-1?????§
			C[a[j]]--; // ?????£????????§?¨???°????????????
		}
	}
}