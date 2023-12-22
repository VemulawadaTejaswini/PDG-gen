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
				for(int i = 0; i < h; i++){
					for(int i = 0; i < w; i++){
						System.out.print("#");
					}
					System.out.println("");
				}
			}
		}
	}
}