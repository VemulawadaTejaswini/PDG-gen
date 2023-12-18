
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long count = 0;
		while(num >= 1000) {
			num /= 10;
			count++;
		}
		long ans = 0;
		if(num < 357) {
		} else if(num < 375) {
			ans += 1;
		} else if(num < 537) {
			ans += 2;
		} else if(num < 573) {
			ans += 3;
		} else if(num < 735) {
			ans += 4;
		} else if(num < 753) {
			ans += 5;
		} else {
			ans += 6;
		}
		ans += count * 6;
		System.out.println(ans);
	}

}
