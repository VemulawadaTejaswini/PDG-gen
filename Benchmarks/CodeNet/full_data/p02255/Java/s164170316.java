public class Main {
	
	static void insertSort(int a[], int n){
		for(int i = 1 ; i < n; i++){
			int v = a[i];
			int j = i - 1;
			while(j >= 0 && a[i] > v){
				a[i + 1] = a[i];
				j--;
			}
			a[j + 1] = v;
		}
	}

	public static void main(String args[]) throws IOException{
		int N,i;
		int A[] = new int[100];
		
		N = System.in.read();
		for(i = 0; i < A.length; i++){
			A[i] = System.in.read();
			if(A[i] == -1)break;
		}
		
		insertSort(A,N);
		
	}
}