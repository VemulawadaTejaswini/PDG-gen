import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		Arrays.parallelSort(a);
		long sum = a[n-1];
		int i = 0,index=n-2;
		for(i=n-3;i>0;i-=2) {
			sum+=2*a[index];
			index--;
		}
		if(i==0) {
			sum+=a[index];
		}
		System.out.println(sum);
	}

}