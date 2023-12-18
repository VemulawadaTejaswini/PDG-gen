import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);static void p(int i) {System.out.println(i);}static void p(long i) {System.out.println(i);}static void p(String i) {System.out.println(i);}static void p(double i) {System.out.println(i);}
	
	
	public static void main(String[] args) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		Random r=new Random();
		int a[]=new int[n+1];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		a[n]=x;
		Arrays.sort(a);
		
		long mi=1000000009;
		
		for(int i=1;i<=n;i++) {
			//p(i+"ba "+(a[i]-a[i-1]));
			if(a[i]-a[i-1]==0)continue;
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
	
