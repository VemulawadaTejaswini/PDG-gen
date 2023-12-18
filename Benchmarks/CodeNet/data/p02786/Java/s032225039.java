import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Long H = sc.nextLong();

		int a = (int) Math.floor(calcLog((long) 2, H) + 1);
		
		long cnt = (long) (Math.pow(2, a) - 1);

		System.out.print(cnt);

		sc.close();

	}

	static double calcLog (Long a, Long b) {
		double value = Math.log(b) / Math.log(a);
		return value;
	}
	
	
}