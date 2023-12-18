import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt(),k=s.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		long res=0;
		
		for(int i=1;i<n;i++) {
			res+=Math.max(0,a[i-1]+1-a[i]);
			a[i]+=Math.max(0,a[i-1]+1-a[i]);
		}
		System.out.println(res);
	}
}
