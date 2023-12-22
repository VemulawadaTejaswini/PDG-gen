import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H, W, i, j;


		for(;;){
			H = sc.nextInt();
			W = sc.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}

			for(i = 0; i < H; i++){
				if(i % 2 == 0){
					for(j = 0;;){
						System.out.printf("#");
						j++;
						if(j == W)break;
						System.out.printf(".");
						j++;
						if(j == W)break;
					}
					System.out.printf("\n");
				}else{
					for(j = 0;;){
						System.out.printf(".");
						j++;
						if(j == W)break;
						System.out.printf("#");
						j++;
						if(j == W)break;
					}
					System.out.printf("\n");
				}
			}
			System.out.printf("\n");
		}
	}
}