import java.util.Scanner;

public class Main {
	private static void p(String s) {System.out.println(s);}
	static Scanner sc = new Scanner(System.in);
	static int a,b,c,n,m;
	//<--main------------------------------------------------>
	public static void main(String[] args) {
		n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++)h[i]=sc.nextInt();
		int ans=0;

		for(int i=0;i<n;i++) {
			boolean flag=true;
			for(int j=0;j<i;j++) {
				if (h[i]<h[j])flag=false;
			}
			if(flag==true)ans++;
		}
		p(""+ans);

	}

}
