import java.util.Arrays;public class Main { 
	int[] random(int n) {  
		int[] a = new int[n];  
		for(int i = 0; i < n; i++) {   
			a[i] = (int)(Math.random() * 1000);  
			}       return a;   
			} 
	void swap(int[] a, int i, int j) {  
		int temp = a[i];  a[i] = a[j];  a[j] = temp; }
	void bubbleSort(int[] a) {  
		// バブルソート 未完成  for(int f =1; f<a.length; f++)
		{  
			for(int i = 1; i < a.length; i++) {   
				if(a[i-1] > a[i]) {    swap(a, i-1, i);  
				}  
				}  
			} 
		} 
	void quickSort(int[] a) { 
		// クイックソートを作ります 
		} 
	void main() {  
		int[] a = {5, 3, 1, 9, 8, 0, 4, 2, 7, 6}; 
		//int[] a = random(100); 
		System.out.println("Before: " + Arrays.toString(a)); 
		long s = System.nanoTime();      
		bubbleSort(a);  
		System.out.println("After " + Arrays.toString(a)); 
		long e = System.nanoTime();  
		System.out.println("Time " + ((e - s) / 1000000f) + " ms");
		} 
	public static void main(String[] args) {  
		new Main().main();
		}
	}
	}
}
