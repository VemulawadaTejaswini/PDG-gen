import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			int h = scan.nextInt();
			int w = scan.nextInt();
			
			if (h == 0 && w == 0){
				break;
			}
			
			for (int i = 0; i < w; i++){
				System.out.printf("#");
			}
			System.out.println();
			
			for (int i = 0; i < h - 2; i++){
				for (int j = 0; j < w; j++){
					if (j == 0 || j == w - 1){
						System.out.printf("#");
					}
					else {
						System.out.printf(".");
					}
				}
				System.out.println();
			}
			
			
			
			for (int i = 0; i < w; i++){
				System.out.printf("#");
			}
			System.out.println();
		}
	}
}