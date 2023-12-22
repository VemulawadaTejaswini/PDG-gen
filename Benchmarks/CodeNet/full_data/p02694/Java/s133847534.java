import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long l = 100;
		int count = 0;
		while(l < X) {
			l += l / 100;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}