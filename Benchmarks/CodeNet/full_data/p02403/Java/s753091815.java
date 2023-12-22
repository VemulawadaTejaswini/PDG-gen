import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		for(;;){
			if(H == 0 && W == 0) break;
			for(int i = 0; i < H; i++){
				for(int n = 0; n < W; n++){
					System.out.print("#");
				}
				System.out.println();
			}
			H = s.nextInt();
			W = s.nextInt();
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}