import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		while (true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			if (H == 0 && W == 0) {
				scan.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				for(int i = 0;i < H;i++){
					for(int t = 0;t < W ;t++){
						if(i == 0 || i == H - 1 || t == 0 || t == W - 1)
							text.append("#");
						else
							text.append(".");
					}
					text.append("\n");
				}
				text.append("\n");
			}
		}
	}
}