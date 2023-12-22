import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double total = 1;

		for(int i=0;i<n;i++) {
			total *= sc.nextLong();
		}
		sc.close();
		long limit = 10;
		for(int i=0;i<17;i++) {
			limit *= 10;
		}
		System.out.println(limit);
		if(total>limit) {
			total = -1;
		}
		long t = (long) total;
		System.out.println(t);
	}

}