import java.util.Scanner;
class Main{
	public static void main(String[] amge){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		for(int a= 0;a < H;a++){
			for(int k = 0;k < W;k++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}