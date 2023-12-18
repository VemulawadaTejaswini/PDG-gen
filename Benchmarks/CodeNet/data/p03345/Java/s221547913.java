import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();

		long ans = (B + C) * K - (A + C) * K;

		if (ans <= Math.pow(10, 18)){
			System.out.println(ans);
		} else {
			System.out.println("Unfair");
		}

	}
}