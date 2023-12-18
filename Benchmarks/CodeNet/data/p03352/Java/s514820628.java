import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X =sc.nextInt();

		for(int i=X;i>0;i--) {

			if(i <= 2) {
				System.out.println(1);
				return;
			}

			for(int j=(int)Math.sqrt(X)+1;j>1;j--) {
				int temp = i;
				int pow = 0;
				while(temp % j == 0) {
					pow++;
					temp /= j;
				}
				System.out.println("i:" + i + ",j:" + j + ",pow:"+pow+",temp:"+temp);
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
