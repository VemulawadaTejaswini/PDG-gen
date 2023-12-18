import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		
		int ptrMin = 0;
		int ptrMax = n-1;
		long max1 = 0;
		boolean useMin = false;
		while(ptrMin<ptrMax-1) {
			max1 += dif(a[ptrMin],a[ptrMax]);
			ptrMin++;
			if(ptrMin==ptrMax-1) {
				useMin = true;
				break;
			}
			max1 += dif(a[ptrMin],a[ptrMax]);
			ptrMax--;
		}
		if(useMin) max1 += dif(a[0],a[ptrMin]);
		else max1 += dif(a[0],a[ptrMax]);
		
		ptrMin = 0;
		ptrMax = n-1;
		long max2 = 0;
		boolean useMax = false;
		while(ptrMin<ptrMax-1) {
			max2 += dif(a[ptrMin],a[ptrMax]);
			ptrMax--;
			if(ptrMin==ptrMax-1) {
				useMax = true;
				break;
			}
			max2 += dif(a[ptrMin],a[ptrMax]);
			ptrMin++;
		}
		if(useMax) max2 += dif(a[n-1],a[ptrMax]);
		else max2 += dif(a[n-1],a[ptrMin]);
		
		System.out.println(Math.max(max1, max2));
		in.close();

	}
	
	public static int dif(int a,int b) {
		if(a>b) return a-b;
		else return b-a;
	}

}
