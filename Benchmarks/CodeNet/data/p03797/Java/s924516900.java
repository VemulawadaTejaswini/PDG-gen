import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		int count = 0;
		
		while (n > 0 && m >= 2) {
			count++;
			n--;
			m -= 2;
		}
		count += m / 4;
		System.out.println(count);
	}
}