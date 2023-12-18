import java.util.Scanner;

public class Proc {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n+1];
		int sum = 0;
		for(int i=1; i<=n; i++) {
			t[i]=scan.nextInt();
			sum+=t[i];
		}
		int m = scan.nextInt();
		int[] result = new int[m];
		int p,x;
		for(int i=0; i<m; i++) {
			p = scan.nextInt();
			x = scan.nextInt();
			result[i] = sum+(x-t[p]);
		}
		for(int r:result)System.out.println(r);

	}

}