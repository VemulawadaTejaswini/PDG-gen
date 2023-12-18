import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		
		int n = sc.nextInt();
		int a[]  =new int[n];
		
		for(int i = 0 ; i< n ;i++){
			a[i] = sc.nextInt() - i;
		}
		
		Arrays.sort(a);
		
		int b = a[n/2];
		
		long sum  =0 ;
		for(int i  =0 ; i < n ;i++){
			sum += Math.abs(a[i] - b);
		}
		System.out.println(sum);
		
	}
}
