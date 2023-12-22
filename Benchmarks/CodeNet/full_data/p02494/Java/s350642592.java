import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		while (true){
			
			int H = input.nextInt();
			int W = input.nextInt();
			
			if (H == 0 && W == 0)break;
			
			for (int i = 0; i < H; i++){
				for (int j = 0; j < W; j++)System.out.print("#");
				System.out.println();
			}
			
			System.out.println();
		}
	}
}