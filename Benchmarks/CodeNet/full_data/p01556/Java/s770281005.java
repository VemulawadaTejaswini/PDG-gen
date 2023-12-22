import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%2==1) {
			System.out.println("NA");
			return;
		}
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int cx2 = x[0]+x[n/2];
		int cy2 = y[0]+y[n/2];
		for (int i=1;i<n/2;i++) {
			int cx = x[i]+x[n/2+i];
			int cy = y[i]+y[n/2+i];
			if (!(cx2==cx && cy2==cy)) {
				System.out.println("NA");
				return;				
			}
		}
		System.out.println((double) cx2/2 + " " + (double) cy2/2 );
	}

}