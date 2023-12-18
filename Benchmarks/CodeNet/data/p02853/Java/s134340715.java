import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int count =0;
		int sum = 0;
		if (X==1) {
			sum +=300000;
			count ++;
		}
		if (X==2) {
			sum +=200000;
		}
		if (X==3) {
			sum +=100000;
		}
		X = sc.nextInt();
		if (X==1) {
			sum +=300000;
			count ++;
		}
		if (X==2) {
			sum +=200000;
		}
		if (X==3) {
			sum +=100000;
		}
		if (count ==2) {
			sum +=400000;
		}
		System.out.println(sum);
	}
}