import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int h = 0, m = 0, s = 0;
		int k = 0;
		s = S % 60;
		k = S / 60;
		m = k % 60;
		h = k / 60;
		System.out.print(h + ":" + m + ":" + s);
	}
}
