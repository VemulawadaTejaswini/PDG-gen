import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner imput = new Scanner(System.in);
		int n = 0;
		while(n == 0){
			int H = imput.nextInt();
			int W = imput.nextInt();
			if(H == 0&&W == 0)break;
			for(int i=0;i<H;i++){
				if(H-i == H||H-i == 1){
					for(int j=0;j<W;j++){
						System.out.print("#");
					}
					System.out.println("");
				}else{
					System.out.print("#");
					for(int j=0;j<W-2;j++){
						System.out.print(".");
					}
					System.out.println("#");
				}
			}
			System.out.println("");
		}
	}
}