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
		int a[] = new int[n];
		for(int i =0 ; i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		
		int ab[] = new int[2];
		for(int i = 0; i< n ;i++){
			ab[i&1] += a[n-i-1];
		}
		System.out.println(ab[0]-ab[1]);
	}
}
