import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T  = sc.nextInt();
		int A  = sc.nextInt();
		int B  = sc.nextInt();
		if(T * A < B) {
			System.out.println(T * A);
		}
		else {
			System.out.println(B);
		}
	}
}