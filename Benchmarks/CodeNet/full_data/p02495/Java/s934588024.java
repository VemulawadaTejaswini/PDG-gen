import java.util.Scanner;

public class PrintAChessborad{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0 ) {
				break;
			
		}
			int i;
			int j;
			for (i=0; i<H; i++) {
				for (j=0; j<W; j++) {
					if ((j % 2 ==0) && (i % 2 == 1)) {
						System.out.printf(".");
					}else if((j % 2 ==1) && (i % 2 == 1)){
						System.out.printf("#");
					}else if((j % 2 ==0) && (i % 2 == 0)){
						System.out.printf("#");
					}else if((j % 2 ==1) && (i % 2 == 0)){
						System.out.printf(".");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			}

	}
}