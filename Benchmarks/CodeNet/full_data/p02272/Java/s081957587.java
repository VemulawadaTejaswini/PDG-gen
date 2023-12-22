import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	static int count;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		String[] str = br.readLine().split(" "); 
		
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		mergeSort(A, 0, A.length);
		
		for(int i = 0;  i < n; i++){
			if(i != n - 1){
				System.out.print(A[i] + " ");
			}else{
				System.out.println(A[i]);
			}
		}
		System.out.println(count);
	}
	
	public static void mergeSort(int[] array, int low, int high){
		if(low + 1 < high){
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle, high);
			merge(array, low, middle, high);
		}
	}
	
	public static void merge(int[] array, int low, int middle, int high){
		int n1 = middle - low;
		int n2 = high - middle;
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		
		for(int i = 0; i < n1; i++){
			L[i] = array[low + i];
		}
		for(int i = 0; i < n2; i++){
			R[i] = array[middle + i];
		}
		
		L[n1] = (int) Double.POSITIVE_INFINITY; 
		R[n2] = (int) Double.POSITIVE_INFINITY;
		
		int i = 0;
		int j = 0;
		
		for(int k = low; k < high; k++){
			if(L[i] <= R[j]){
				array[k] = L[i];
				i++;
			}else{
				array[k] = R[j];
				j++;
			}
			count++;
		}
	}
}