import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//int k = sc.nextInt();

		long count=0;

		if(Math.abs(n-m)<=1) {
			System.out.println(n+n-1);
		}else {
			System.out.println(Math.max(n, m)+Math.max(n, m)-1);
		}
	}
}


