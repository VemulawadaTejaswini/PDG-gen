import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong(), D = sc.nextLong(),x = sc.nextLong();
		for(int i = 0; i < 10; i++) {
			long sx = r*x - D;
			System.out.println(sx);
			x = sx;
		}
	}
}
