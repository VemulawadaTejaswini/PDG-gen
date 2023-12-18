import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long[] a = new long[5];
		long n = scan.nextLong();

		int i;
		for(i = 0; i < 5; i++)
			a[i] = scan.nextLong();

		Arrays.sort(a);

		System.out.println((n - 1) / a[0] + 5);

	}
}
