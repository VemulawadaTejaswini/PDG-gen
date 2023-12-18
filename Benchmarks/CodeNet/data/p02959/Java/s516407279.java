import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n];
		for(int i=0;i<n+1;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=scan.nextInt();
		}
		scan.close();

		long sum=0;
		for(int i=0;i<n;i++) {
			int x=Math.min(b[i],a[i]);
			sum+=x;
			x=Math.min(b[i]-x,a[i+1]);
			a[i+1]-=x;
			sum+=x;
		}
		System.out.println(sum);
	}
}
