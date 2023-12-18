import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner push = new Scanner(System.in);
		int A = push.nextInt();
		int B = push.nextInt();

		int sum = A * B - (A + B - 1);
		System.out.println(sum);
	}
}
