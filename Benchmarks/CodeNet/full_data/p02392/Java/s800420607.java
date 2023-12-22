import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		if(a<b && b<c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
