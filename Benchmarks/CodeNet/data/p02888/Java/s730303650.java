import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

public class Main{
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]  = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		int ctr=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if((a[i]+a[j])>a[k] && (a[j]+a[k])>a[i] && (a[i]+a[k])>a[j]) {
						ctr++;
					}
				}
			}
		}
		System.out.println(ctr);
		
		
	}
}