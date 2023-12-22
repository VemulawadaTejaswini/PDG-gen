import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int H;
		int W;
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(;;){
		  H = sc.nextInt();
		  W = sc.nextInt();
			for(a = 0; a != H; a++){
				for(b = 0; b != W; b++){
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