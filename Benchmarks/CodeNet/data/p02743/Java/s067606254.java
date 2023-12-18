import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=scan.nextLong();
		scan.close();

		if(a+b+2*Math.sqrt(a)*Math.sqrt(b) < c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}