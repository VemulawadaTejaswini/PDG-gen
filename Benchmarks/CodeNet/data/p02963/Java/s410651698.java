import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		double p = Math.sqrt(s*1.0);
		if (p - (int)p == 0) {
			System.out.println("0 0 " + (int)p + " 0 0 " + (int)p);
		} else if (s % 2 == 0) {
			int n = s / 2;
			System.out.println("0 0 2 0 0 " + n);
		} else {
			System.out.println("0 0 " + s + " 0 " + s + " 1");
		}
		
		sc.close();
	}

}
