import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int x = scanner.nextInt();
			if(x==0) {
				break;
			}
			if(x/10==0) {
				System.out.println(x);
				continue;
			}
			int sum = 0;
			while (x/10!=0) {
				sum += x%10;
				x /= 10;
				if (x/10==0) {
					sum +=x;
				}
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
