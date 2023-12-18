import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		long H = Long.parseLong(numbers[0]);
		long W = Long.parseLong(numbers[1]);

		if(H%2==0) {
			long s = H/2;
			System.out.println(s*W);
		}
		if(H%2==1 && W%2==0) {
			System.out.println(H*(W/2));
		}
		if(H%2==1 && W%2==1) {
			System.out.println(H*((W-1)/2)+(H+1)/2);
		}

	}
}
