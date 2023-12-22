import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();
		Long x;
		
		if (B <= N)
			x = B - 1;
		else
			x = N;
		Double temp = Math.floor((A * x) / B) - A * Math.floor(x / B);
		System.out.println(temp.longValue());
	}

}
