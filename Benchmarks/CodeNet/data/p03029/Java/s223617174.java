import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int p = scan.nextInt();
		scan.close();
		System.out.println((a*3+p)/2);
	}
}