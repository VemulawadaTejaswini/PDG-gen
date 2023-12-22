import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] teisyutu = new boolean[30];
		Arrays.fill(teisyutu, false);
		for (int i = 0; i < 28; i++) {
			teisyutu[in.nextInt() - 1] = true;
		}
		for (int i = 0; i < 30; i++) {
			if (!teisyutu[i]) {
				System.out.println(i + 1);
			}
		}
	}
}