import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[]=new int[a];
		for(int i=0;i<a;i++) {
		c[i]=scan.nextInt();
		}
		Arrays.sort(c);
		for(int i=0;i<b;i++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(c[0]<y) {
				for(int j=0;j<x;j++) {
					if(c[j]>=y) {
						break;
					}
					c[j]=y;
				}
			}
			Arrays.sort(c);
		}
		long ans=0;
		for(int i=0;i<a;i++) {
			ans+=c[i];
		}
		System.out.println(ans);
	}
}
