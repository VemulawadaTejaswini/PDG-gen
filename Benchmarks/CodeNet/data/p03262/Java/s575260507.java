import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[]=new int[a];
		int max=0;
		if(a==1) {
			int d=scan.nextInt();
			System.out.println(Math.abs(b-d));
		}
		else {
		for(int i=0;i!=a;i++) {
			int d=scan.nextInt();
			if(d>max) {
				max=d;
			}
			c[i]=Math.abs(b-d);
		}
		int ans=0;
		for(int i=max;;) {
			for(int j=0;j!=a+1;j++) {
				if(j==a) {
					ans=i;
					break;
				}
				if(c[j]%i!=0) {
					i=c[j]%i;
					break;
				}
			}
			if(ans!=0) {
				break;
			}
		}
		System.out.println(ans);
		}
		}
}