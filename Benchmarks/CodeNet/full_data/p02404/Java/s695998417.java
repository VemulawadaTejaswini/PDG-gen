import java.util.*;

public class Main{

	public static void main(String[] args) {
		scan();
	}
	public static void scan() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			if(H == 0 && W == 0){break;}
			Print(H , W);
			System.out.println("");
			
		}
		scanner.close();
		return ;
	}
	public static void Print(int H, int W){
		for(int y = 0 ; y < H ; y++){
			for(int x = 0; x < W ; x++){
				if(y==0 || x == 0 || y == H-1 || x == W-1){
					System.out.print("#");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println("");
		}
		return;
	}	
	
	
}