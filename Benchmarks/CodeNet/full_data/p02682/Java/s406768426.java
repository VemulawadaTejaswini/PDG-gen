import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int sum = 0;

		if(a <= k) {
			k -= a;
			sum += a;
		}else {
			sum += k;
			k = 0;
		}

		if(k == 0) {

		}else if(b <= k){
			k -= b;
		}else {
			k = 0;
		}

		if(k == 0) {

		}else if(c <= k){
			k -= c;
			sum -= c;
		}else {
			sum -= k;
			k = 0;
		}

		System.out.println(sum);
	}
}
