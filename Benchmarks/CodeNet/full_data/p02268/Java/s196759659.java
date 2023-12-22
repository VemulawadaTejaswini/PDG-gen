import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n+1];
		String[] ins = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			S[i] = Integer.parseInt(ins[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] T = new int[q];
		ins = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			T[i] = Integer.parseInt(ins[i]);
		}

		int C = 0;
		for(int i = 0; i < T.length; i++){
			boolean flag = binarySearch(T[i], S, n);
			if(flag == true)
				C++;
		}
		System.out.printf("%d\n", C);
	}

	private static boolean binarySearch(int key, int[] A, int n){
		int left = 0;
		int right = n;
		while(left < right){
			int mid = (left + right) / 2;
			if(A[mid] == key)
				return true;
			else if(key < A[mid])
				right = mid;
			else
				left = mid + 1;
		}
		return false;
	}
}