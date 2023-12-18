import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int z = in.nextInt();
		int w = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		if(n==1) System.out.println(Math.abs(a[0]-w));
		else System.out.println(Math.max(Math.abs(a[n-1]-w), Math.abs(a[n-1]-a[n-2])));
		

	}

}
