import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
			
		}
		
		
		
		int count = 0;
		
		for(int i = 0;i<a.length-1;i++) {
			if(a[i] != a[i+1]) {
				if(a[i]<a[i+1]) {
					a[i] = a[i] + 1;
					count++;
				}
				else {
					a[i+1] += 1;
					count++;
				}
			}
		}
		System.out.println(count);
		
		

	}

}
