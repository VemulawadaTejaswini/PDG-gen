
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n/100;
		if (n<=a*111) System.out.println(a*111);
		else System.out.println((a+1)*111);

	}
}
