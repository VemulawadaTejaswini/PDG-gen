
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int H, W, i, j;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			H = scan.nextInt();
			W = scan.nextInt();
			
			for(i = 0; i < H; i++) {
				for(j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			
			if(H == 0 && W == 0) break;
			
			System.out.println();
			
		}
		
	}

}
