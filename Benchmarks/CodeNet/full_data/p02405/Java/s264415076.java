import java.util.Scanner;

// AOJ problem

public class Main7 {
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
					if(j % 2 == 1) {
						if(i % 2 == 1) {
							System.out.print("#");
						} else {
							 System.out.print(".");
						}
					} else {
						if(i % 2 == 1) {
							System.out.print(".");
						} else {
							System.out.print("#");
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
