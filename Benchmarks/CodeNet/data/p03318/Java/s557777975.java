import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ud = "";
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long num;
		for(num = 0; num < 9;) {
			num++;
			System.out.println(num);
			k--;
			if(k <= 0) {
				return;
			}
		}
		loop:for(int i = 1;; i++) {
			for(int j = 0; j < i; j++)ud += "9";
			for(int j = 1; j < 10 * i; j++) {
				System.out.println(j + ud);
				k--;
				if(k <= 0)break loop;
			}
			ud = "";
		}
	}
}
