import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		while(h != 0 || w != 0){
			for(int i = 0; i < w; i++){
				System.out.print("#");
			}
			System.out.println();
			for(int i = 1; i < h - 1; i++){
				for(int k = 0; k < w; k++){
					if(k == 0 || k == w - 1){
						System.out.print("#");
					}
					else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			for(int i = 0; i < w; i++){
				System.out.print("#");
			}
			System.out.println();
			h = in.nextInt();
			w = in.nextInt();
		}
	}

}