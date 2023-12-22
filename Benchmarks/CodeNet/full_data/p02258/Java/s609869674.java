import java.util.Scanner;
public class Main {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int j = 0; j < n; j++) {

			for(int k = j + 1; k < n; k++) {
				
				if(arr[k] - arr[j] > max) {
					max = arr[k] - arr[j];
				}
			}
		}
		
		System.out.println(max);
	}

}

