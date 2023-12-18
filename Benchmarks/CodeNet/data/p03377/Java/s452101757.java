import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=0, b=0, x=0;
		a=scanner.nextInt();
		b=scanner.nextInt();
		x=scanner.nextInt();
		
		String anser = "NO";
		if (b>=x-a && x>=a) {
			anser = "YES";
		}
		System.out.println(anser);
		scanner.close();
	}
}
