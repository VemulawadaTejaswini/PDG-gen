package brincandeira;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {

		Scanner tc = new Scanner(System.in);
		
		int k = 0, l = 0, z = 0;
		
		
		int x = tc.nextInt();
		
		int a[] = new int[x];
		
		for (int i = 0; i < x; i++) a[i] = tc.nextInt();
		
		if(x % 2 == 0) {
			z = x/ 2;
			int b[] = new int[z];
			int c[] = new int[z];
			
			
			for (int i = 0; i < z; i++) b[i] = a[i];
				
			for (int i = 0; i < z; i++) c[i] = a[i+z];
			
			
			
			for (int i = 0; i < z; i++) k += b[i];

			for (int i = 0; i < z; i++) l += c[i];
			
			
			if(k <= l) k = l - k;
			
			else k -= l;
			
			System.out.println(k);
	
			} else {
			z = x - 1;
			z /= 2;
			
			
			int b[] = new int[z];
			int c[] = new int[z];
			
			for (int i = 0; i < z; i++) b[i] = a[i];
			
			for (int i = 0; i < z; i++) c[i] = a[i+z];
			
			
			for (int i = 0; i < z; i++) k += b[i];

			for (int i = 0; i < z; i++) l += c[i];
			

			k = (l-a[z]+a[x-1]) - (k + a[z]);
			
			
			System.out.println(k);
			
		}
		
	}
}
