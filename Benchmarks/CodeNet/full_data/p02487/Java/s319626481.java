import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int w = scn.nextInt();
		while(h != 0 || w != 0){
			for(int j = 0; j < w; j++) System.out.print("#");
			System.out.println();
			for(int i = 1; i < h - 1; i++){
				System.out.print("#");
				for(int j = 1; j < w - 1; j++){
					System.out.print(".");
				}
				System.out.println("#");
			}
			for(int j = 0; j < w; j++) System.out.print("#");
			System.out.println();
			System.out.println();
			h = scn.nextInt();
			w = scn.nextInt();
		}
	}

}