import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long target = sc.nextLong();

		//		long l =100000*100000;
		//		System.out.println(l);
		for (long i = -1; i < 100000; i++) {
			for (long j = -1; j < 100000; j++) {
				long tmp = (i * i * i * i * i) - (j * j * j * j * j);
				if (tmp == target) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}

		System.out.println();

	}
}