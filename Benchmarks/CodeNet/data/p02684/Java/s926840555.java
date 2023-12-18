import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer[] a = new Integer[n];
		
		int re = 0;
		int tmp =0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long ama = k % n;
		
		for(int i = 0; i < ama; i++) {
			tmp = a[i];
			re = a[tmp-1];
		}
		
		System.out.println(re);
		
		

	}
}

