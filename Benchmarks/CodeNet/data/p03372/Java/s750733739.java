import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n+1];
		int sumv = 0;

		
		for(int i = 0; i < n+1; ++i) {
			x[i] = sc.nextInt();
			sumv += sc.nextInt();
		}
		Arrays.sort(x);
		sc.close();
		
		System.out.println(sumv- x[n-1]);
	}
}