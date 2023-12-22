import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		long H,W;
		do{
		H = scan.nextInt();
		W = scan.nextInt();

		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				System.out.print("#");
			}
				System.out.print("\n");
		}
		}while(H != 0 || W!= 0);
	}
}