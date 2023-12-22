import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	scan.close();
	int remainder = 1000 - (N % 1000);
	System.out.println(remainder);
}
}