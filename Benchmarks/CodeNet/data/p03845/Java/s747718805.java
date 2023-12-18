import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		while(m-->0) {
			int p=scan.nextInt();
			int x=scan.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				if(a[i]==a[p-1]) {
					continue;
				}
				sum+=a[i];
			}
			System.out.println(sum+x);
		}

	}

}
