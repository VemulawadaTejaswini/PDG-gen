import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt();
		if(X < A) System.out.println(0);
		else System.out.println(10);
	}
}