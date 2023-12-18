import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		
		int h = 0;
		int w = 0;
		int count = 0;
		
		for(int i = n-1; i >= 1 ; i--) {
			if(a[i] == a[i-1]){
				count++;
				if(h == 0) {
					h = a[i];
					continue;
				}
				if(count == 3) {
					w = a[i];
				}
				if(h != 0 && a[i] < h) {
					w = a[i];
				}
			}
		     else {
					count = 0;
				}
				
			if(h != 0 && w != 0) {
				break;
			}
		}
		
		System.out.println(h*w);
	}

}
