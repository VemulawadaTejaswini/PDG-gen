import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int i,j;
			int H = sc.nextInt();
			int W= sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}else{
				for(i=1;i<=H;i++){
					for(j=1;j<=W;j++){
						if((i+j)%2==0){
							System.out.printf("#");
						}else{
							System.out.printf(".");
						}
					}
					System.out.printf("\n");
				}
			}
		}
	}