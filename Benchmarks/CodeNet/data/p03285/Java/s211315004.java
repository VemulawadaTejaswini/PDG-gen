import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		if(N % 4 == 0 || N % 11 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}