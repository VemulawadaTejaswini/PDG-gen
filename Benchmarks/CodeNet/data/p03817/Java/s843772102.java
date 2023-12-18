import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x  = sc.nextLong();
		long ans = 0;

		ans = x/11*2;
		x = x%11;

		for (;;) {
			ans +=1;
			if (ans%2 != 0){
				x -= 5;
			}else {
				x -= 6;
			}

			if (x < 0) {
				System.out.println(ans);
				break;
			}
		}
	}

}
