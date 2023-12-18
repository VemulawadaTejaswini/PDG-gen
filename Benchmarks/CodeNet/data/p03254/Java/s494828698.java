
import java.util.Arrays;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n  = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int  count = 0;
		int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		if(sum == x) {
			System.out.println(a.length);
		}
		if(x > sum) {
			System.out.println(a.length-1);
		}
		if(x < sum) {
			Arrays.sort(a);
			for(int i = 0; i<n;i++) {
				if(x>=a[i]) {
					x-=a[i];
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(count);
		}

 
 
	}
 
}