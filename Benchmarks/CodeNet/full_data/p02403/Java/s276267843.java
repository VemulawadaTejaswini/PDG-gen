import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int h = scanner.nextInt();
			int w = scanner.nextInt();

			if(h == 0 && w == 0){
				break;
			}

			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					System.out.println("#");
				}
				System.getProperty("line.separator");
			}
			System.getProperty("line.separator");
		}
	}
}