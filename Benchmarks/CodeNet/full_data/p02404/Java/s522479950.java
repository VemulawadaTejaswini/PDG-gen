import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder output = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			
			if (H == 0 && W == 0)
				break;
			
			for (int i = 0; i < W; i++) {
				output.append("#");
			}
			output.append('\n');
			for (int i = 1; i < H-1; i++) {
				output.append("#");
				for (int j = 1; j < W-1; j++) {
					output.append(".");
				}
				output.append("#");
				output.append('\n');
			}
			for (int i = 0; i < W; i++) {
				output.append("#");
			}
			output.append('\n').append('\n');
		}
		
		System.out.print(output);
	}

}