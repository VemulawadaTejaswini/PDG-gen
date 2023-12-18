import java.util.Scanner;

public class Main {
	static int r,g,b,n,sum=0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		r=sc.nextInt();
		g=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		int ans=0;
		for(int i=0;i<=(n/r+1);i++) {
			for(int j=0;j<=(n/g+1);j++) {
				for(int k=0;k<=(n/b+1);k++) {
					if(r*i+j*g+k*b==n)ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
