import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double n = scan.nextDouble();
		scan.close();
		double d = n / 2;
		int i = (int)Math.ceil(d);
		System.out.println(i);
	}
}
