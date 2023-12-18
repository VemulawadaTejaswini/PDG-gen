import java.util.Scanner;
public class Main{
	public static void main(String[] a) {
		try (Scanner s = new Scanner(System.in)) {
			int x = s.nextInt();
			System.out.println((int)((1+x)*(x/2.0)));
		}
	}
}
