import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) break;
			
			for(int i=0; i < H; i++){
				
			}
			System.out.println("");
			
			for(int i=1; i < H-1; i++){
				System.out.print("#");
				
				for(int j=1; j <W-1; j++){
					System.out.print(".");
				}
				System.out.println("#");
		}
			
			if(H > 1){
				for(int i=0; i < W; i++){
					System.out.print("#");
				}
				System.out.println("");
			}
		System.out.println("");
	    }
	    sc.close();
	}
}
