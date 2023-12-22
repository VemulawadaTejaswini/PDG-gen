import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int w = scn.nextInt();
		while(h != 0 || w != 0){
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			h = scn.nextInt();
			w = scn.nextInt();
		}
	}

}