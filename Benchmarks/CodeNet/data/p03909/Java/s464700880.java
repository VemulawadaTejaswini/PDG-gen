import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			final int H = sc.nextInt();
			final int W = sc.nextInt();
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(sc.next().equals("snuke")){
						System.out.println((char)('A' + j) + "" + (i + 1));
						return;
					}
				}
			}
			
		}
	}
	
	
}
