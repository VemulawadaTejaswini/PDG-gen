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
		int max = a[n-1];
		int idx = 0;
		while(a[idx]<max/2) {
			idx++;
		}
		int half = a[idx];
		if(idx>0) {
			if((double)max/2-a[idx-1]<a[idx]-(double)max/2) {
				half = a[--idx];
			}
		}
		if(max==half) {
			half = a[idx-1];
		}
		System.out.println(max+" "+half);
		in.close();
	}

}
