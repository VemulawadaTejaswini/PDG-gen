import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mons[]=new int[n+1];
		int y[]=new int[n];
		for(int i=0;i<=n;i++) {
			mons[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			y[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(mons[i]+mons[i+1]>y[i])
			    c+=y[i];
			else
				c+=mons[i]+mons[i+1];
			if(mons[i]<y[i])
				mons[i+1]=mons[i+1]-(y[i]-mons[i]);

		}
		System.out.println(c);

	}

}