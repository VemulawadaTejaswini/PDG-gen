import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		int v[] = new int[n];
		int sumv = 0;

		
		for(int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sumv += v[i];
		}
		Arrays.sort(x);
		sc.close();
		
		System.out.println(sumv- x[n-1]);
	}
}