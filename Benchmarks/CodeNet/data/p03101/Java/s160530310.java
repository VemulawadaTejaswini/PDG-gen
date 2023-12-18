import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int H = Integer.parseInt(s.next());
		int N = Integer.parseInt(s.next());
		int n = Integer.parseInt(s.next());
		int h = Integer.parseInt(s.next());

		int trouts = H * N;
		int vm = H * h;
		int hm = n * N;
		int crossNum = h * n;

		System.out.println(trouts - (vm + hm - crossNum));
	}
}