import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a = sc.nextLong();
		long max = a;
		for (int i =0;i<N-1;i++) {
			long temp = sc.nextLong();
			if (temp<max) {
				System.out.println("No");
				return ;
			}
			if (temp >= a+1) {
				a = temp-1;
			} else if (a>=temp+2) {
				System.out.println("No");
				return ;
			}
			max = a;
		}
		System.out.println("Yes");
	}
}