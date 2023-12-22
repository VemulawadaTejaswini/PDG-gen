import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private long N,overflow_num = 80;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextLong();

		for(int i = 0;i < N;i++) {
			char[] n1,n2;

			n1 = scan.next().toCharArray();
			n2 = scan.next().toCharArray();


			int n = Math.max(n1.length, n2.length);

			if(n > overflow_num) {
				System.out.println("overflow");
				continue;
			}

			char[] num1,num2;

			if(n1.length > n2.length) {

				num1 = n1;
				num2 = new char[n];
				Arrays.fill(num2, '0');

				for(int j = 0;j < n2.length;j++) {
					num2[n-j-1] = n2[n2.length-j-1];
				}

			}else if(n1.length < n2.length) {

				num2 = n2;
				num1 = new char[n];
				Arrays.fill(num1, '0');

				for(int j = 0;j < n1.length;j++) {
					num1[n-j-1] = n1[n1.length-j-1];
				}

			}else {
				num1 = n1;
				num2 = n2;
			}

			char[] ans = new char[n];
			int next = 0;

			for(int j = n-1;j >= 0;j--) {
				int sum = (num1[j] - '0') + (num2[j] - '0') + next;
				next = sum / 10;
				ans[j] = (char)(sum % 10 + '0');
			}

			if(next + n > overflow_num) {

				System.out.println("overflow");

			}else {
				if(next == 1) {
					System.out.print(1);
				}
				System.out.println(ans);
			}


		}

		scan.close();

	}
}
