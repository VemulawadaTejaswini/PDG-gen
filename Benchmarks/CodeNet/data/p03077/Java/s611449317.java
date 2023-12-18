import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力
		long N = sc.nextLong();

		long min = Long.MAX_VALUE;
		for(int i=0; i<5; i++) {
			min = Math.min(min, sc.nextInt());
		}

		System.out.println((N%min==0) ? N/min + 4 : N/min + 5);

		sc.close();
	}
}