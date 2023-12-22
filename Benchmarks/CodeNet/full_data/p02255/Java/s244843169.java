public class Main {
	
	static void insertSort(int a[], int n){
		for(int i = 1 ; i < n - 1; i++){
			int v = a[i];
			int j = i - 1;
			while(j > 0 && a[i] > v){
				a[i + 1] = a[i];
				j--;
			}
			a[j + 1] = v;
		}
	}

}