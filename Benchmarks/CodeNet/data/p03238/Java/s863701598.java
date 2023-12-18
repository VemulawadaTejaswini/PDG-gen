import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int type= sc.nextInt();
		if (type==1) {
			System.out.println("Hello World");
		} else {
			int A= sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}