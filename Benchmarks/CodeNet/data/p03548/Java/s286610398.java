
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int Z = scan.nextInt();
		int sum = 0;
		int count = 0;
		sum += Z;
		while(true) {
			sum += (Y + Z);
			if(X >= sum) {
				count++;
			} else {
				System.out.println(count);
				break;
			}
		}
		scan.close();

	}

}
