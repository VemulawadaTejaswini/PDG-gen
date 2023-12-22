import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int yoko = in.nextInt();
			int tate = in.nextInt();
			int i, j;
			if(tate == 0 & yoko == 0) return;
			for (i = 0; i < tate; i++) {
				for (j = 0; j < yoko; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}