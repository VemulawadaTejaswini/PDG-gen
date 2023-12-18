import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final long X = sc.nextLong();
		final long Y = sc.nextLong();
		
		long a = X;
		int len = 0;
		while(a <= Y) {
			a = a * 2;
			len++;
		}
		System.out.println(len);
		sc.close();
	}

}