import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		long total = 0;
		long sum = 0;
		long length = 0;
		for (int i = 0; i < m; i++) {
		    int d = sc.nextInt();
		    long c = sc.nextLong();
		    length += c;
		    sum += d * c;
		    total += sum / 9;
		    sum %= 9;
		}
		total += length - 1;
		System.out.println(total);
   }
}

