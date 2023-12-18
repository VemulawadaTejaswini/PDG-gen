import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long max = 0;
		for(int i = 1;i <= N;i++){
			max = (long)Math.max(max, (A*i)/B - A*(i/B));
		}
		System.out.println(max);
	}

}