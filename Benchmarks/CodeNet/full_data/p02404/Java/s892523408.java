import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 0;
		int W = 0;
		String sh = "#";
		String dot = ".";
		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W ==0)break;
			//上辺
			for(int j = 0; j < W; j++) {
				System.out.print(sh);
			}
			 System.out.println("");
			//間
			for(int i = 1; i < H-1; i++) {
				System.out.print(sh);
				for(int j = 1; j < W-1; j++) {
					System.out.print(dot);
				}
				System.out.println(sh);
			}
			//下辺
			for(int j = 0; j < W; j++) {
				System.out.print(sh);
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
