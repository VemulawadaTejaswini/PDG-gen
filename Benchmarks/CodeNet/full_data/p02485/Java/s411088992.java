import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num = sc.nextInt();

			if(num == 0)
				break;
			else {
				int sum = 0;
				for(int i = 1000; i != 0; i /= 10)
					sum += (num / i) % 10;

				System.out.println(sum);
			}
		}
	}
}