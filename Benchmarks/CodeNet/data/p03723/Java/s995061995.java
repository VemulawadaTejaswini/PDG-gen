import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;

		if(a==b&&b==c) {
			System.out.println(-1);
			return;
		}

		while(true) {
			if(a%2	==1||b%2==1||c	%2==1) {
				break;
			}
			int a_temp = a/2;
			int b_temp = b/2;
			int c_temp = c/2;
			a = b_temp+c_temp;
			b = a_temp+c_temp;
			c = a_temp+b_temp;
			count++;
			
		}
		System.out.println(count);
	}
}
