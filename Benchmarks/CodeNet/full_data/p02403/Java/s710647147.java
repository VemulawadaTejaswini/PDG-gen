import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int w = scan.nextInt();

		while(true){
			if(h == 0 && w == 0){
				break;
			}else{
				for(int a = 0; a < h; a++){
					for(int b = 0; b < w; b++){
						System.out.print("#");
					}
					System.out.println("");
				}
			}
		}
	}
}