
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		//END data stand by
		
		int temp;
		
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
				if(a[i] > a[k]) {
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}
		//END sort a[i]
		
		for(int i=0;i<n-1;i++) {
			if(a[i]<x) {
				x -= a[i];
			}else {
				sc.close();
				System.out.println(i);
				return;
			}
		}
		
		if(x == a[n-1]) {
			System.out.println(n);
		}else {
			System.out.println(n-1);
		}
		
		sc.close();
	}

}