import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = 0;
		n = sc.nextLong();

		long a = 100;
		int ans = 0;

		while (true) {
			ans++;
			long tmp = 0;
			tmp = (long) (a * 0.01);
			a += tmp;

			if(a >= n){
				System.out.println(ans);
				break;
			}

		}
	}
}