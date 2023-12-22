import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % K == 0) {
			System.out.print("OK");
		} else if (B % K == 0) {
			System.out.print("OK");
		} else if ((A / K + 1) * K < B) {
			System.out.print("OK");
		} else {
			System.out.print("NG");
		}
		
	return;

	}
}
