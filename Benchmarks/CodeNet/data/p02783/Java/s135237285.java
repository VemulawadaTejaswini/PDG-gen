import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();
		int c = a/b;
		if (a - b*c <= 0) {
			System.out.println(c);
		}else {
			if (a - b*(c+1) <= 0)
			System.out.println(c+1);
		}

	}
}
