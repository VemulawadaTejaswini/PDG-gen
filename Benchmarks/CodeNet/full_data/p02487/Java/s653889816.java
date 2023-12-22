import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0)
				break;
			for(int x = 0; x < w; x++) {
				System.out.print("#");
			}
			System.out.println("");
			for(int y = 1; y < h - 1; y++) {
				System.out.print("#");
				for(int x = 1; x < w - 1; x++) {
					System.out.print(".");
				}
				System.out.println("#");
			}
			for(int x = 0; x < w; x++) {
				System.out.print("#");
			}
			System.out.println("\n");
		}
	}
}