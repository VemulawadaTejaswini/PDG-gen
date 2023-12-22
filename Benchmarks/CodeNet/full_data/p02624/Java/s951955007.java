import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[] = new int[n+1];
		Arrays.fill(a, 2);
		a[1] = 1;
		
		for(int i=2;i<=n/2;i++) {
			for(int j=2*i;j<=n;j+=i) {
				a[j]++;
			}
		}
		long sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i*a[i];
		}
		System.out.println(sum);
		
	}

}
