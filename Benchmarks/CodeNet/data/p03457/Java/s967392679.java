import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int t[]=new int[n];
		int x[]=new int[n];
		int y[]=new int [n];
		for(int i=0;i<n;i++){
			int f=stdin.nextInt();
			int g=stdin.nextInt();
			int h=stdin.nextInt();
			t[i]=f;
			x[i]=g;
			y[i]=h;
		}
		//		int j=0,k=0,l=0;
		int flag=0;
		for(int u=0;u<n;u++){
			if(t[u]%2==((x[u]+y[u])%2) && t[u]>=(x[u]+y[u]))
				//			System.out.println("Yes");
				flag=1;
			else{
				//			System.out.println("No");
				flag=0; break;
			}
		}
		if(flag==1)
			System.out.println("Yes");
		else if(flag==0)
			System.out.println("No");
	}
}