import java.util.Scanner;

class AOJ10013 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			int h = scan.nextInt();
			int w = scan.nextInt();
			
			if (h == 0 && w == 0){
				break;
			}
			
			for (int i = 0; i < h; i++){
				for (int j = 0; j < w; j++){
					if (j == 0 || j == w - 1 || i == 0 || i == h - 1){
						System.out.printf("#");
					}
					else {
						System.out.printf(".");
					}
				}
				System.out.println();
			}
			
			System.out.println();
		}
	}
}