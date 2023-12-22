import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}