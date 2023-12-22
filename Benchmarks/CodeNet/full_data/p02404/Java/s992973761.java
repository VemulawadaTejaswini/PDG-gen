import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
    	while (sc.hasNextInt()) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; ++i) {
					System.out.print("#");
				for (int k = 2; k < W; k++) {
					if(i==0 |i+1==H)
						System.out.print("#");
					else 	
					System.out.print(".");
				}
					System.out.print("#");
					System.out.println();
			}
					System.out.println();
    	}
    }
}

    

