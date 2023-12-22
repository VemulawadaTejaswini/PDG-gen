import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long a[]=new long[100002];
		long sum=0;
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			a[m]++;
			sum+=m;
		}
		
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			long d=a[p];
			a[p]=0;
			sum-=p*d;
			
			long add=q*d;
			sum+=add;
			a[q]+=d;
			
			System.out.println(sum);
		}
	}
	
	
}

 
