
import java.util.*;


public class Main {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n+1];
		for(int i = 1;i<=n;i++)a[i] = s.nextInt();
		int c=  0;
		for(int i = 2;i<n;i++)
		{
			if((a[i]>a[i-1]&&a[i]>a[i+1])||(a[i]<a[i-1]&&a[i]<a[i+1]))
			{}else c++;
		}
		
		 System.out.println(c);
	}
}
