import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int H;
		int W;
		
		for(;;){
			H = sc.nextInt();
			W = sc.nextInt();
			if(W == 0){if(H == 0){break;}}
			for(int a = 0; a != H; a++){
				for(int b = 0; b != W; b++){
					if(b == 0){
						System.out.print("#");
					} else if(b == W - 1) {
						System.out.print("#");
					} else if(a == 0){
						System.out.print("#");
					} else if(a == H - 1){
						System.out.print("#");
					} else {
						System.out.print(",");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}