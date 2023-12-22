import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextInt();
		double B = stdIn.nextDouble();

		System.out.printf("%.0f",(A*(B*100))/100);
		stdIn.close();
	}

}
