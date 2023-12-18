import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt()+1;
		}
		scan.close();


		double max=0;
		double ans=0;
		for(int i=0;i<n;i++) {
			if(i<k)ans+=p[i];
			else ans+=p[i]-p[i-k];

			if(ans>max)max=ans;
		}

		System.out.println(max/2);
	}
}