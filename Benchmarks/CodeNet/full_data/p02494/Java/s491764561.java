import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		while(h != 0 || w != 0){
			for(int i = 0; i < h; i++){
				for(int k = 0; k < w; k++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			h = in.nextInt();
			w = in.nextInt();
		}
	}

}