import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long sum=0;
		long N = cin.nextInt();
		for(int i = 0; i < N;i++){
			long n = cin.nextLong();
			sum += n;
		}
		System.out.println(sum/N);
	}

}