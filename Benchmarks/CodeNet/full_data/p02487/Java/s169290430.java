import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) {
				break;
			} else if(h >= 3 && w <= 300) {
				
				for(int i=1; i<=h; i++) {
					
					for(int j=1; j<=w; j++) {
						if(i == 1 || i == h || j == 1 || j == w) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
					
					System.out.println();
				}
				
				System.out.println();
			}
		}
	}
}