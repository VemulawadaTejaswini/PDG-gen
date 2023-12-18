import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] = in.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		long[] sumB = new long[n];
		long nowB = b[0];
		int ptrA = 0;
		long count = 0;
		while(ptrA<n && a[ptrA]<nowB) {
			ptrA++;
			count++;
		}
		sumB[0] = count;
		for(int i=1;i<n;i++) {
			nowB = b[i];
			while(ptrA<n && a[ptrA]<nowB) {
				ptrA++;
				count++;
			}
			sumB[i] = count + sumB[i-1];
		}
		
		long sum = 0;
		int ptrB = 0;
		for(int i=0;i<n;i++) {
			long nowC = c[i];
			while(ptrB<n && b[ptrB]<nowC) {
				ptrB++;
			}
			if(ptrB>0) sum += sumB[ptrB-1];
		}
		
		System.out.println(sum);
		in.close();
		
		

	}

}
