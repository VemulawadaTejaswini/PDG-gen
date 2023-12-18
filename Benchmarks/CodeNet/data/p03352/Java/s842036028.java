import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X =sc.nextInt();

		for(int i=X;i>0;i--) {

			if(i == 1) {
				System.out.println(i);
				return;
			}

			for(int j=2;j<(int)Math.sqrt(X)+1;j++) {
				int temp = i;
				int pow = 0;
				while(temp % j == 0) {
					pow++;
					temp /= j;
				}
				if(temp == 1) {
					System.out.println(i);
					return;
				}else if(pow > 0 && temp != 1) {
					break;
				}
			}
		}
	}
}
