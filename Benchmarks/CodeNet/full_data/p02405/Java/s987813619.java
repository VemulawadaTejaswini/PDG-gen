import java.util.Scanner;

// AOJ problem

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			
			if(h == 0 && w == 0) {
				break;
			}
			for(int j = 0; j < h; j++) {
				for(int i = 0; i < w; i++) {
					if(h % 2 == 1) {
						if(w % 2 == 1) {
							System.out.println("#");
						} else {
							 System.out.println(".");
						}
					} else {
						if(w % 2 == 1) {
							System.out.println(".");
						} else {
							System.out.println("#");
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
