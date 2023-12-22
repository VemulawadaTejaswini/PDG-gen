import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner num = new Scanner(System.in);

		while(true){
			int Height = num.nextInt();
			int Width = num.nextInt();
			
			if(Height == 0 && Width == 0) break;
		
			for(int i = 0;i < Height;i++){
				for(int j = 0;j < Width;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}