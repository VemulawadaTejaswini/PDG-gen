import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		for (Scanner in = new Scanner(System.in); in.hasNext();) {
			long t;
			System.out.println(new StringBuilder().append((t = (-in.nextInt() * 3600 - in.nextInt() * 60 - in.nextInt()) + (in.nextInt() * 3600 + in.nextInt() * 60 + in.nextInt())) / 3600).append(' ').append((t %= 3600) / 60).append(' ').append(t % 60)	.toString());

		}
	}
}