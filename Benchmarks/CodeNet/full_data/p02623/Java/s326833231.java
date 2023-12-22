import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int k = s.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
			
		}
		for(int i=0;i<m;i++) {
			b[i] = s.nextInt();
		}
		
		long sum = 0;
		int i=0,j=0;
		while((i<n && sum+a[i]<=k) || (j<m && sum+b[j]<=k)) {
			
			//System.out.println(i+" "+j);
			if(i<n && j<m) {
				if(a[i]<b[j]) {
					sum+=a[i];
					i++;
				}
				else {
					sum+=b[j];
					j++;
				}
			}
			else if(i<n) {
				sum+=a[i];
				i++;
			}
			else {
				sum+=b[j];
				j++;
			}
		}
		System.out.println(i+j);
	}

}
