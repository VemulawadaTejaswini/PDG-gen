import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		long sum =0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			sum+=a[i];
		}
		scan.close();
		for(int i=0;i<n;i++) {
			System.out.println(sum-a[i]);
		}
	}
}