import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = k; i < n; i++) {
			if(i > 0 && arr[i] > arr[i-1]) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}