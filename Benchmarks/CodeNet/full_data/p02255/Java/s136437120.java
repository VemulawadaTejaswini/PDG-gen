import java.util.Scanner;
public class Main {
	
	public static void sort(int n, int [] arr) {
		
		int j;
		
		for(int t = 0; t < n; t++) {
			System.out.print(arr[t]);
			
			if(t < n - 1) {
				System.out.print(" ");
			}
		}
		
		System.out.println("");
		
		for(int i = 1; i < n; i++) {
			
			int key = arr[i];
			j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
			
			for(int k = 0; k < n; k++) {
				System.out.print(arr[k]);
				if(k < n - 1) {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
	
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		sort(n, arr);
		
		
	}
}

