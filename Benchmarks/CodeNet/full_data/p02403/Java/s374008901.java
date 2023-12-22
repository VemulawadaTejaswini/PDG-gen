import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		
		StringBuilder yoko = new StringBuilder();
		
		
		for (int i = 0; ; i++) {
			
			String line = sc.nextLine();
			String[] HW = line.split(" ");
			
			int H = Integer.parseInt(HW[0]);
			int W = Integer.parseInt(HW[1]);
			
			if (H == 0 && W == 0) {
				break;
				
			}
			
			for (int j = 0; j < W; j++) {
				
				yoko.append("#");
				
			}
			
			String y = yoko.toString();
			
			for (int j = 0; j <= H; j++) {
				
				System.out.println(y);
				
			}
			
			System.out.println( "\n" );
			
			
		}
		
		

	}

}

