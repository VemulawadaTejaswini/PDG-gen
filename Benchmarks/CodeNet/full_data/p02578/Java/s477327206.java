import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int total = 0;
		int largest = arr[0];
		for(int i=1; i<n; i++) {
			
			if(arr[i] <= largest) {
				total += largest - arr[i];
			}else if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println(total);
		sc.close();
	}

}
