
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n+1];
		x[0] = 2;
		x[1] = 1;
		for(int i=2; i<n+1; i++){
			x[i] = x[i-1]+ x[i-2];
		}
		System.out.println(x[n]);

		sc.close();

	}
}
