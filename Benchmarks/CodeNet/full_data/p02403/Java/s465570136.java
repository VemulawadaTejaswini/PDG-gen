import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int H,W;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			H=scan.nextInt();
			W=scan.nextInt();
			if(H == 0 && W== 0) {
				break;
			}
			for(int i = 0;i < H; i++) {
				for(int j= 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}