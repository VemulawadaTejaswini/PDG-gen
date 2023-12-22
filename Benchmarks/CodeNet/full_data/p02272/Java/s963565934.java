public class Main {

	static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n];
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) S[i] = Integer.parseInt(str[i]);
		
		mergeSort(S, 0, n);
		
		for(int i = 0; i < n; i++){
			System.out.print(S[i]);
			if(i + 1 == n) System.out.print("\n");
			else System.out.print(" ");
		}
		System.out.println(count);
	}
	
	public static void merge(int[] A, int left, int mid, int right){
		int n1 = mid - left, n2 = right - mid;
		int[] L = new int[n1 + 1], R = new int[n2 + 1];
		
		for(int i = 0; i < n1; i++) L[i] = A[left + i];
		for(int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = R[n2] = Integer.MAX_VALUE;
		
		for(int i = 0, j = 0, k = left; k < right; k++){
			count++;
			if(L[i] <= R[j]) A[k] = L[i++];
			else A[k] = R[j++];
		}
	}
	
	public static void mergeSort(int[] A, int left, int right){
		if(left + 1 < right){
			int mid = (left + right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}
}
