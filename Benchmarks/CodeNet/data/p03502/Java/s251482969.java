import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int f = sum(N);
		if ( N%f == 0 ) System.out.println("Yes");
		else System.out.println("No");
	}
	private static int sum(int n) {
		int res = 0;
		while(n>0) {
			res += n%10;
			n = n/10;
		}
		return res;
	}
}
