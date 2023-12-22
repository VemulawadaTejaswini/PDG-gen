import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		double B = scan.nextDouble();
		int ans1 =(int)(B*100);

		long ans =(A * ans1) / 100;
		System.out.println(ans);
	}

}
