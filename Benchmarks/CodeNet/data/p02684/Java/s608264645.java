import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer[] a = new Integer[n];
		
		int re = 0;
		
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int tmp =a[0];
		
		for(int i = 0; i < k-1; i++) {
			re = a[tmp-1];
			tmp = re;
		}
		
		System.out.println(re);
		
		
	}
}

