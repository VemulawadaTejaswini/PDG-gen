import java.util.Scanner;

public class Main {
public static void main(String [] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int n2 = in.nextInt();
		int [] arr2 = new int [n2];
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
		}
		
		int count = 0;
		
		
		
		for(int i = 0; i < n2; i++) {
			
			int left =0;
			int right = n;
			int mid = (left + right) / 2;
			
			while(left != mid && right != mid) {
				
				if(arr2[i] == arr[mid]) {
					count++;
					break;
				}
				
				else if(arr2[i] < arr[mid]) {
					right = mid;
					mid = (left + right) / 2;
				}
				
				else {
					left = mid;
					mid = (left + right) / 2;
				}
			}
		}
		
		System.out.println(count);
}

}

