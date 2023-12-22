import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		
		while(true){
			int H = s.nextInt();
			int W = s.nextInt();
			if(H == 0 && W == 0) break;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W ; j++){
					if(i == 0 || i == H - 1 || j == 0 || j == W -1){
						System.out.print("#");
					}
					else System.out.printf(".");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}