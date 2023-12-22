import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0){
				break;
			}else{
				for(int i = 0; i < H; i++){
					if(i%2 == 0){
						for(int j = 0; j < W/2; j++){
							System.out.printf("#.");
						}												if(W%2 == 1){
							System.out.printf("#");
						}
					}else{
						for(int j = 0; j < W/2; j++){
							System.out.printf(".#");
						}
						if(W%2 == 1){
							System.out.printf(".");
						}
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}