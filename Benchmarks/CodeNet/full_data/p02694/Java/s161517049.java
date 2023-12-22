import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//		double x = Math.log(n/100) / Math.log(1.01);
//		System.out.println(Math.round(x));
		double sum = 100;
		for (int i = 0; i < 10000; i++) {
			sum = Math.floor(sum * 1.01);
			if (sum >= n) {
				System.out.println(i+1);
				return;
			}
		}

	}

}
