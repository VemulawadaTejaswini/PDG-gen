import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = lucas(n);
		System.out.println(ans);
	}

	public static long lucas(int n) {
		if(n==0) {
			return 2;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return lucas(n-1)+lucas(n-2);
		}
	}
}
