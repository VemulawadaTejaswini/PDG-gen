import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[]=new int[a];
		int max=0;
		for(int i=0;i!=a;i++) {
			int d=scan.nextInt();
			if(d>max) {
				max=d;
			}
			c[i]=Math.abs(b-d);
		}
		int ans=0;
		for(int i=max;;i--) {
			for(int j=0;j!=a+1;j++) {
				if(j==a) {
					ans=i;
					break;
				}
				if(c[j]%i!=0) {
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