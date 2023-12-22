/**
 * 
 */
import java.util.Scanner;

/**
 * @author Neeraj
 *
 */
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i,count=0,j;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(Math.abs(a[j]+a[i])==j-i)
					count++;
			}
		}
		
		System.out.println(count);
		
	}

}
