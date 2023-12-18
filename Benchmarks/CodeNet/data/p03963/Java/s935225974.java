import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),K=sc.nextInt();

		System.out.println((int)(K*Math.pow((K-1), N-1)));


	}
	public static int sample(int n) {
		return n;
	}

}
