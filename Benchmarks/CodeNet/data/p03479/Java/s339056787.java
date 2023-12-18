import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long X = reader.nextLong();
		long Y = reader.nextLong();
		long ans = 0;
		while (X <= Y) {
			X *= 2;
			ans++;
		}

		System.out.println(ans);
		reader.close();
	}
}



