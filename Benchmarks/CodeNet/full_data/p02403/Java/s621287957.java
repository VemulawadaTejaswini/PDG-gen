import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		while(true) {
			int h = stdin.nextInt();
			int w = stdin.nextInt();
			
			if(h == 0 && w == 0) break;
			if(h<=300 && w<=300) {
			
				for(int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						System.out.println("#");
					}
					System.out.println();
				}
				System.out.println();
			}
		stdin.close();
		}
	}

}