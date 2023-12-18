import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ans=0;
		int c[]=new int[b];
		for(int i=0;i!=b;i++) {
			c[i]=scan.nextInt();
		}
		int count=0;
		String val="0";
		for(ans=a;;ans++) {
			int i=ans;
			int e=0;
			int f=0;
			int g=0;
			int h=0;
			val=String.valueOf(i);
			int d=i%10;
			i/=10;
			if(val.length()>=2) {
			e=i%10;
			i/=10;
			if(val.length()>=3) {
			f=i%10;
			i/=10;
			if(val.length()>=4) {
			g=i%10;
			i/=10;
			if(val.length()>=5) {
			h=i%10;
			}
			}
			}
			}
			for(int j=0;j!=b+1;j++) {
				if(j==b) {
					count=1;
					break;
				}
				if(c[j]==d||c[j]==e||c[j]==f||c[j]==g||c[j]==h) {
					break;
				}
			}
			if(count==1) {
				System.out.println(ans);
				break;
			}
		}
		}
	}