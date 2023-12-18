import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A>12) {
			System.out.println(B);
		}else {
			System.out.println(A>5 ? B/2:0);
		}
	}

}