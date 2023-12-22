import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long d = sc.nextLong();
		long t = sc.nextLong();
		long s = sc.nextLong();
		if(t*s>=d) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}