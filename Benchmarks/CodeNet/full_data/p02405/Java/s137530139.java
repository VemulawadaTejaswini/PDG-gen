import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(i % 2 == 0){
					if(j % 2 == 0)  System.out.print("#");
					else System.out.print(".");
				}
				else if(i % 2 == 1){
					if(j % 2 == 0 ) System.out.print(".");
					else System.out.print("#");
				}
			}
			System.out.println();
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