import java.util.Scanner;
public class Main {

	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		int numSwaps = 0;
		
		int n = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int j = 0; j < n - 1; j++) {
			
			
			for(int h = n - 1; h > j ; h--) {
				
				if(arr[h] < arr[h - 1]) {
					int temp = arr[h];
					arr[h] = arr[h - 1];
					arr[h - 1] = temp;
					numSwaps++;
				}
			}
		}
		
		for(int k = 0; k < n; k++) {
			System.out.print(arr[k]);
			
			if(k != n - 1) {
				System.out.print(" ");
			}
		}
		
		System.out.println("\n" + numSwaps);
	}
}

