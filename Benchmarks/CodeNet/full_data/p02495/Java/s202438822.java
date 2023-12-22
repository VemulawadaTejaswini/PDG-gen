import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int H;
		int W;
		
		for(;;){
		  H = sc.nextInt();
		  W = sc.nextInt();
		  int c = 0;
		  if(H == 0)if(W == 0)break;
			for(int a = 0; a != H; a++){
				for(int b = 0; b != W; b++){
					if(b % 2 == c){
						System.out.print("#");
					} else {
						System.out.print(".");
					}
					
				}
				System.out.println("");
					if(c == 1){
						c = 0;
					} else {
						c = 1;
					}
			}
			System.out.println("");
		}
	}
}