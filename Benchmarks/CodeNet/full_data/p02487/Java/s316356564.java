import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H, W, i, j, k;


		for(;;){
			H = sc.nextInt();
			W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}

			for(i = 0; i < H; i++){
				if(i == 0 || i == H-1){
					for(j = 0; j < W; j++){
					System.out.printf("#");
					}
				}else{
					System.out.printf("#");
					for(k = 1; k < W-1; k++){
						System.out.printf(" ");
					}
					System.out.printf("#");
				}
			System.out.printf("\n");
			}

			System.out.printf("\n");
		}
	}
}