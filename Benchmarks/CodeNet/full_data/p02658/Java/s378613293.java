import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		long mul = 1;
		for (int i = 0; i < num; i++) {
			long n = s.nextLong();
			mul *= n;
		}
		
		s.close();

		if (mul <= 1000000000000000000L) {
			System.out.println(mul);
		}
		else {
			System.out.println(-1);
		}
		

	}

}
