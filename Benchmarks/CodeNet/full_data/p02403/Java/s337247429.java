import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			int h = s.nextInt();
			int w = s.nextInt();
			if(h == 0 && w == 0) return;
			for(int i = 0; i < h; ++i) {
				for(int j = 0; j < w; ++j) {
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}