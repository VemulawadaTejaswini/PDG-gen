import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		long count = 0;
		while(x<=y) {
			x = x<<1;
			count++;
		}
		System.out.println(count);
		in.close();
	}

}
