import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int bmax = 0,bme;
		for(int i = 0; i< n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n;i++) {
			b[i] = a[i];
			bme = bmax;
			for(int k = 0;k < (bmax+1)/2;k++) {
				int m = b[k];
				b[k] = b[bme];
				b[bme] = m;
				bme--;
			}
			bmax += 1;
		}
		for(int i = 0;i < n;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

}