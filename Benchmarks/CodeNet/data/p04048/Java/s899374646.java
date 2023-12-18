import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long ans = 0;
		long m;
		while(x != 0){
			if(2*x < n){
				x = n-x;
			}
			m = n-x;
			ans += m * 3;
			n = x;
			x = n-m;
		}

		System.out.println(ans);
	}

}