import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		long b=scan.nextInt();
		long c[]=new long[a];
		for(int i=0;i!=a;i++) {
		c[i]=scan.nextLong();	
		}
		if(a==1) {
			System.out.println(c[0]);
		}
		else {
		long ans=-1145148101;
		for(int i=0;i!=b;i++) {
			long kari=0;
			for(int j=0;j!=a;j++) {
				kari+=(i^c[j]);
			}
			if(kari>ans) {
				ans=kari;
			}
		}
		System.out.println(ans);
}
	}
	}