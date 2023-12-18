//2019/3/14
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int a = 0;

		int i = 1;

		if(X==1) {

			System.out.println(1);

		}else {

			while(a<=X) {

				a = i*i;

				i++;
			}

			int ans = (i-2)*(i-2);

			System.out.println(ans);
		}
	}
}
