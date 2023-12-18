import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int a[]=new int[n+1];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		a[n]=x;
		Arrays.sort(a);
		
		long mi=1000000009;
		
		for(int i=1;i<=n;i++) {
			mi=Math.min(a[i]-a[i-1], mi);
		}
		
		for(int i=1;i<=n;i++) {
			if((a[i]-a[i-1])%mi!=0) {
				mi=1;
				break;
			}
		}
		p(mi);
		
		
	}
	
}
	
