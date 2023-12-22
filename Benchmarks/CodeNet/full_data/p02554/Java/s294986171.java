import java.lang.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x =10;
		
		long y=9;
		long z=8;
				long w=0;
		for(int i=1;i<=n;i++) {
			x*=10;
			y*=9;
			z*=8;
			w=(x-2*y+z)%1000000007;
		}
		System.out.println(w);
		sc.close();
	}
}