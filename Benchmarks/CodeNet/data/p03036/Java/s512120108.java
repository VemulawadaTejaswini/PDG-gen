import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long r = scn.nextInt();
		long D = scn.nextInt();
		long x = scn.nextInt();
		for(int i = 0;i < 10;i++) {
			x = r * x - D;
			System.out.println(x);
		}
	}

}
