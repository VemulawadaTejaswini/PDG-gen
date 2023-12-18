import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		long[] n = new long[num];
		for(int i = 0; i < num; i++) {
			n[i] = sc.nextLong() - (long)(i+1);
		}
		Arrays.sort(n);
		if(num % 2 == 0) {
			System.out.println((n[num/2-1]+n[num/2])/2);
		} else {
			System.out.println(n[num/2]);
		}
	}
}
