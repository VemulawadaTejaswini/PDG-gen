import java.util.Scanner;
class Main1{
	public static void main(String[] amge){
		Scanner scan = new Scanner(System.in);
		int H;
		int W;
		for(int o=1;o>0;o++){
			H = scan.nextInt();
			W = scan.nextInt();
			for(int a= 0;a < H;a++){
				for(int k = 0;k < W;k++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			if(W==0 && H==0){
				break;
			}
		}
	}
}