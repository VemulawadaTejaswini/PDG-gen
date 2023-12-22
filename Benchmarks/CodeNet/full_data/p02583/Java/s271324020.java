import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		Arrays.parallelSort(a);
		int ctr = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]>a[k] && a[i]!=a[j] && a[j]!=a[k] && a[k]!=a[i]) {
						ctr++;
					}
				}
			}
		}
		System.out.println(ctr);
		
	}
}
