import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long Q = sc.nextLong(), H = sc.nextLong(), S = sc.nextLong(), D = sc.nextLong();
		long N = sc.nextLong();
		long per_litter = Math.min(4 * Q, Math.min(2 * H, S));
		if(2 * per_litter < D) System.out.println(N * per_litter);
		else {
			long buy_D = (N - (N % 2)) / 2;
			System.out.println((N % 2) * per_litter + buy_D * D);
		}
	}
}