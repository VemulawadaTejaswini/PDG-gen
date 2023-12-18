import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int tx = in.nextInt();
		int ty = in.nextInt();
		in.close();
		
		int dx = tx - x;
		int dy = ty - y;
		
		for (int i = 0; i < dx; i++) {
			sb.append("R");
		}
		for (int i = 0; i < dy; i++) {
			sb.append("U");
		}
		for (int i = 0; i < dx; i++) {
			sb.append("L");
		}
		for (int i = 0; i <= dy; i++) {
			sb.append("D");
		}
		for (int i = 0; i <= dx; i++) {
			sb.append("R");
		}
		for (int i = 0; i <= dy; i++) {
			sb.append("U");
		}
		sb.append("L");
		sb.append("U");
		for (int i = 0; i <= dx; i++) {
			sb.append("L");
		}
		for (int i = 0; i <= dy; i++) {
			sb.append("U");
		}
		sb.append("L");
		System.out.println(sb.toString());
	}

}
