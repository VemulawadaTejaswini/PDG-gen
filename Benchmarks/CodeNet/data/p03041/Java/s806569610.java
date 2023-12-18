import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Main().doWork(args));
	}

	public String doWork(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		String ch = reader.next();

		reader.close();

		return ch.substring(0, k-1) + ch.substring(k-1, k+1-1).toLowerCase() + ch.substring(k+1-1);
	}
}
