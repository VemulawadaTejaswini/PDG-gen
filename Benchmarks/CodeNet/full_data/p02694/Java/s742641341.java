import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long sum = 100;
		int i = 0;

		for (; ;i++ ) {
			if (sum>=x) {
				System.out.println(i);
				break;
			}
			sum+=(double)sum*0.01;
		}


	}
}
