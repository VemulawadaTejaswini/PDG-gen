import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			
			int h = scan.nextInt();
			int w = scan.nextInt();

			int a = 0;
			
			if(h == 0 && w == 0){
				break;
			}else if(a == h - 1){
				break;
			}else{

				for(int b = 0; b < w; b++){
					System.out.print("#");
				}
				System.out.println();
			}
			a++;
		}
	}
}