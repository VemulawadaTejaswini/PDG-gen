import java.util.Scanner;

public class Main {
	public static void(String[] args){

		Scanner sc = new Scanner(System.in);
		int h,w;
		
		while(TRUE){
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) break;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
		}
	}
}