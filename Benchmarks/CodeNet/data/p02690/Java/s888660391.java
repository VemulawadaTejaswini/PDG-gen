import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		ol:
		for (long i = -1000; i <= 1000; i++) {
			for (long j = -1000; j <= 1000; j++) {
				if (i*i*i*i*i - j*j*j*j*j == x) {
					System.out.println(i + " " + j);
					break ol;
				}
			}
		}
	}
}
