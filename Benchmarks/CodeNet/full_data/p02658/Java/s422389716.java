import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double total = 1;

		for(int i=0;i<n;i++) {
			total *= sc.nextLong();
		}
		double limit = (long) Math.pow(10, 18);
		if(total>limit) {
			total = -1;
		}
		System.out.println(total);
	}

}