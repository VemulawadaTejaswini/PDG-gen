import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int minAmount = X;
		int count = 0;
		int m = X;
		for (int i = 0; i < N; i++) {
			m = sc.nextInt();
			if(minAmount > m) {
				minAmount = m;
			}
			X -= m;
			count++;
		}
		while (X > minAmount) {
			X -= minAmount;
			count++;
		}
		System.out.println(count);
	}
}