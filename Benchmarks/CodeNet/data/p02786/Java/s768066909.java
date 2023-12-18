import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long multiple = 1;
		while(h > 0) {
			h = h / 2;
			multiple *= 2;
		}
		System.out.println(multiple - 1);

	}


}

